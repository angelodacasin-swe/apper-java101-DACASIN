import java.math.BigInteger;
import java.util.Scanner;

class Homework2_scratchWork {
    public static void main(String[] args) {
        int num = 3;
        long startTime = System.nanoTime();
        boolean isPrime = isPrimeNumber(num);
        long endTime = System.nanoTime();

        System.out.println(num + " is prime: " + isPrime);
        System.out.println("Duration: " + (endTime - startTime) + " ns");
    }

        public static boolean isPrimeNumber(int num) {
            return num > 1 && BigInteger.valueOf(num).isProbablePrime(100);

        }

    }