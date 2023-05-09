package mathematics;

// Walang main method
public class Arithmetic {
    // create method: modifiers returntype methodName
    // make it public para ma-access sa iba
    public int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public int subtract(int num1, int num2) {
        int difference = num1 - num2;
        return difference;
    }

    public int multiply(int num1, int num2) {
        int product = num1 * num2;
        return product;
    }

    public int divide(int num1, int num2) {
        int quotient = num1 / num2;
        return quotient;
    }
}
