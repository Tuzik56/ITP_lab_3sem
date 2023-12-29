public class Test {
    public static void main (String[] args) {
        Headphones a = new Headphones();
        Headphones b = new Headphones(1, 2, 3, "x", "y");
        System.out.println(b.phraseHeadphones());
        System.out.println(Headphones.getCountObjects());
    }
}
