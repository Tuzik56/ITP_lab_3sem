public class Palindrome {
    public static void main(String[] args){
        for (String word: args) {
            System.out.println(isPalindrome(word));
        }
    }

    public static String reverseString(String line) {
        String reverseLine = "";
        for (int i = 0; i < line.length(); i++) {
            reverseLine = line.charAt(i) + reverseLine;
        }
        return reverseLine;
    }

    public static boolean isPalindrome(String line) {
        return line.equals(reverseString(line));
    }
}
