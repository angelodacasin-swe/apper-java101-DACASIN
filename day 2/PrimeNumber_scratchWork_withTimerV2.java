import java.math.BigInteger;

class Homework2_TrialTimer {
    public static void main(String[] args) {

        int num = 8098;

        long startTime = System.nanoTime();
        boolean isPrime = isPrimeNumber(num);
        long endTime = System.nanoTime();
        
        System.out.println(num + " is prime: " + isPrime);
        System.out.println("Duration: " + (endTime - startTime) + " ns");
    }
        public static boolean isPrimeNumber(int num) {
            return num > 1 && BigInteger.valueOf(num).isProbablePrime(100); // includes a checker if > 1, for future use in case we will use a Scanner class
    }
}

// Apologies for the messy code. I'm still trying things out.

