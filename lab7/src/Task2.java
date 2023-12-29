public class Task2 {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3}, {0, 2, 4}, {-8, 7, 0}};
        CompareThread[] threads = new CompareThread[matrix.length];
        int max = Integer.MIN_VALUE;

        for (int i=0; i < threads.length; i++) {
            threads[i] = new CompareThread(matrix[i]);
            threads[i].start();
        }

        for (CompareThread thread: threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        for (CompareThread thread: threads) {
            if (thread.getMax() > max) {
                max = thread.getMax();
            }
        }

        System.out.println(max);
    }
}
