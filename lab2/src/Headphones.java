public class Headphones extends СomputerPeripherals {
    private String str1;
    private String str2;
    private static int countObjects = 0;

    public Headphones (int number1, int number2, int number3, String string1, String string2) {
        super(number1, number2, number3);
        str1 = string1;
        str2 = string2;
        countObjects++;
    }

    public Headphones () {
        this(0, 0, 0, "", "");
    }

    public String getStr1 () {
        return str1;
    }

    public String getStr2 () {
        return str2;
    }

    public void setStr1 (String string) {
        str1 = string;
    }

    public void setStr2 (String string) {
        str2 = string;
    }

    @Override
    public void method1 () {
        System.out.println("Headphones");
    }
    @Override
    public void method2 () {
        System.out.println(getStr1() + getStr2());
    }

    public static int getCountObjects () {
        return countObjects;
    }

    public String phraseHeadphones () {
        return "Я наушники я наушники вот ваши переменные я больше ничего не умею: " + getStr1() + " " + getStr2();
    }
}
