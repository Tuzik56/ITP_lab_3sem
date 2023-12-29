public class Keyboard extends СomputerPeripherals {
    private String str1;
    private String str2;
    private String str3;

    public Keyboard (int number1, int number2, int number3, String string1, String string2, String string3) {
        super(number1, number2, number3);
        str1 = string1;
        str2 = string2;
        str3 = string3;
    }

    public Keyboard () {
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
        System.out.println("Keyboard");
    }
    @Override
    public void method2 () {
        System.out.println(getStr1() + getStr2() + getStr3());
    }

    public String phraseKeyboard () {
        return "А я клавиатура клавиатура и я еще больше ничего не умею";
    }
}
