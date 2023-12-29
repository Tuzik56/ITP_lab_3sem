import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class Task3 {
    public static void main(String[] args) {
        Storage storage1 = new Storage(100);
        Storage storage2 = new Storage(0);

        System.out.println(storage1.getSum());

        final CompletableFuture<Void> future1 = CompletableFuture.supplyAsync(()-> {
            Loader loader1 = new Loader(storage1, storage2, "1");
            loader1.work();
            return null;
        });

        final CompletableFuture<Void> future2 = CompletableFuture.supplyAsync(()-> {
            Loader loader2 = new Loader(storage1, storage2, "2");
            loader2.work();
            return null;
        });

        final CompletableFuture<Void> future3 = CompletableFuture.supplyAsync(()-> {
            Loader loader3 = new Loader(storage1, storage2, "3");
            loader3.work();
            return null;
        });

        try {
            future1.join();
            future2.join();
            future3.join();
        } catch (CompletionException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(storage2.getSum());
    }
}
