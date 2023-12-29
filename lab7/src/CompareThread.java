public class CompareThread extends Thread {
    private final int[] line;
    private int max;

    public CompareThread(int[] line) {
        this.line = line;
        this.max = Integer.MIN_VALUE;
    }

    public void run() {
        findMax();
    }

    private void findMax() {
        for (int i: line) {
            if (i > max) {
                max = i;
            }
        }
    }

    public int getMax() {
        return max;
    }
}