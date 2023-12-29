public class Main {
    public static void main(String[] args) {
        DataManager manager = new DataManager();

        RemoveDuplicates processor1 = new RemoveDuplicates();
        SortData processor2 = new SortData();
        FindLetters processor3 = new FindLetters();

        manager.registerDataProcessor(processor1);
        manager.registerDataProcessor(processor2);
        manager.registerDataProcessor(processor3);

        manager.loadData("file1.txt");
        manager.processData();
        manager.saveData("file2.txt");
    }
}
