public class SumThread extends Thread {
    private final int[] arr;
    private final int start;
    private final int end;
    private int sum;

    public SumThread(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    public void run() {
        countSum();
    }

    private void countSum() {
        for (int i = start; i < end; i++) {
            sum += arr[i];
        }
    }

    public int getSum() {
        return sum;
    }
}
