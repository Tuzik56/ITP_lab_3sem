public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        SumThread thread1 = new SumThread(arr, 0, arr.length / 2);
        SumThread thread2 = new SumThread(arr, arr.length / 2, arr.length);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        int sum = thread1.getSum() + thread2.getSum();
        System.out.println(sum);
    }
}
