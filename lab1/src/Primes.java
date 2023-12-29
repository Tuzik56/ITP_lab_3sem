public class Primes {
    public static void main(String args[]){
        for (int n = 2; n <= 100; n++) {
            if (isPrime(n)) {
                System.out.println(n);
            }
        }
    }

    public static boolean isPrime(int n) {
        int i = (int) Math.sqrt(n);
        if (i == 1) { i += 1 ;}
        boolean prime = true;
        while (i < n & prime) {
            if (n % i == 0) {
                prime = false;
            }
            i++;
        }
        return prime;
    }
}
