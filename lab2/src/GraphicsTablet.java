public class GraphicsTablet extends СomputerPeripherals {
    private String str1;
    private String str2;
    private String str3;

    public GraphicsTablet (int number1, int number2, int number3, String string1, String string2, String string3) {
        super(number1, number2, number3);
        str1 = string1;
        str2 = string2;
        str3 = string3;
    }

    public GraphicsTablet () {
        this(0, 0, 0,"", "", "");
    }

    public String getStr1 () {
        return str1;
    }

    public String getStr2 () {
        return str2;
    }

    public String getStr3 () {
        return str3;
    }

    public void setStr1 (String string) {
        str1 = string;
    }

    public void setStr2 (String string) {
        str2 = string;
    }

    public void setStr3 (String string) {
        str3 = string;
    }

    @Override
    public void method1 () {
        System.out.println("GraphicsTablet");
    }
    @Override
    public void method2 () {
        System.out.println(getStr1() + getStr2() + getStr3());
    }

    public void print (int value) {
        System.out.println(Integer.toString(value) + "GraphicsTablet");
    }

    public void print (boolean value) {
        System.out.println(Boolean.toString(value) + "GraphicsTablet");
    }

    public int sum () {
        return getN1() + getN2() + getN3();
    }
}
