package main;

import mathematics.*; //import package to read classes

public class Main {
    public static void main(String[] args) {
        // If you make it public static int add, pwedeng
        // Arithmetic.add(num1, num2) na lang
        /* Code will be
        int sum = Arithmetic.add(5, 2);
        System.out.println(sum);
        == no need to instantiate na == */

        Arithmetic a = new Arithmetic();
        Constants c = new Constants();

        int sum = a.add(16, 4);
        System.out.println(sum);

        int difference = a.subtract(16, 4);
        System.out.println(difference);

        int product = a.multiply(16, 4);
        System.out.println(product);

        int quotient = a.divide(16, 4);
        System.out.println(quotient);

        System.out.println(c.pi);
    }
}
