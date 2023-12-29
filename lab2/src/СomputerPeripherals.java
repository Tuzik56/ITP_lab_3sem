public abstract class СomputerPeripherals {
    private int n1;
    private int n2;

    private int n3;
    private String message;

    public СomputerPeripherals(int number1, int number2, int number3) {
        n1 = number1;
        n2 = number2;
        n3 = number3;
    }

    public СomputerPeripherals () {
        this(0, 0, 0);
    }

    public int getN1 () {
        return n1;
    }
    
    public void setN1 (int value) {
        n1 = value;
    }

    public int getN2 () {
        return n2;
    }

    public void setN2 (int value) {
        n2 = value;
    }

    public int getN3 () {
        return n3;
    }

    public void setN3 (int value) {
        n3 = value;
    }

    public abstract void method1 ();
    public abstract void method2 ();

}
