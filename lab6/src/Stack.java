public class Stack<T> {
    private T[] data;
    private int size;
    public Stack(int capacity) {
        data = (T[]) new Object[capacity];
        size = 0;
    }

    public void push(T t) {
        this.data[size] = t;
        size++;
    }

    public T pop() {
        if (size > 0) {
            size--;
            T output = this.data[size];
            this.data[size] = null;
            return output;
        } else {
            return this.data[size];
        }
    }

    public T peek() {
        if (size > 0) {
            return this.data[size-1];
        } else {
            return this.data[size];
        }
    }
}
