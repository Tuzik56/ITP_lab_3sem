import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.*;

public class DataManager {
    private final ExecutorService service;
    private final List<Object> processors;
    private final List<String> data;
    private String line;

    public DataManager() {
        this.service = Executors.newFixedThreadPool(5);
        this.processors = new ArrayList<>();
        this.data = new ArrayList<>();
        this.line = "";
    }

    public void registerDataProcessor(Object processor) {
        processors.add(processor);
    }

    public void loadData(String source) {
        File file = new File(source);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                Collections.addAll(data, scanner.nextLine().split(" "));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void processData() {
        ArrayList<Future<String>> futures = new ArrayList<>();
        for (Object processor : processors) {
            for (Method method : processor.getClass().getMethods()) {
                if (method.getAnnotation(DataProcessor.class) != null) {
                    futures.add(service.submit(() -> {
                        try {
                            return (String) method.invoke(processor, data);
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                            return "";
                        }
                    }));
                }
            }
        }

        for (Future<String> future : futures) {
            try {
                if (future.get() != null) {
                    line += future.get();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        service.shutdown();
    }

    public void saveData(String destination) {
        File file = new File(destination);
        try {
            PrintWriter printWriter = new PrintWriter(file);
            if (line != null) {
                printWriter.print(line);
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
