public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World");

        // Let's talk about variables
        int age = 15;

        // numeric whole number datatypes: short, int, long
        System.out.println(age);

        age = age + 10;

        System.out.println(age);

        long myBalanceInGcash = 1000000000;
        long newBalance = myBalanceInGcash + age; //data type of newBalance should be long since it is 64 bit
        System.out.println(newBalance);

        // decimal: double and float
        double price = 4.45;

        // ___ newPrice = price + age; **is it valid to add price and age? YES bc they are part of the family of numbers\
        doublenewPrice = price + age;
        System.out.println(newPrice);

        float discount = 9.56f;
        // ___  subtotal = newPrice + discount; ** pwede ba i-add? yes
        double subtotal = newPrice + discount;
        System.out.println(subtotal);
        // remember: double and float holds decimal. double 64 bit, float 32 bit

        double num1 = 1;
        float num2 = 4000.54f;
        double result = num1 + num2;

        int resultMaxValue = Integer.MAX_VALUE + Integer.MAX_VALUE;
        System.out.println(resultMaxValue);
    // Strings
    int number1 = 1;
    char number1char = '1';
    String number1string = "1"; //array of characters ['1', '', '', '', ...]

    String myName = "Orvyl"; //use this
    char[] myNameArr = new char[]{'O', 'r', 'v', 'y', 'l'}; //over this

    System.out.println(myName);
    System.out.println(myName.toLowerCase());
    System.out.println(myName.toUpperCase());
    String completeName = myName + " Tumaneng";
    System.out.println(completeName);
    System.out.println(myName.substring(2, 5));

    boolean isEqualName = myName.equals("orvyl");
    boolean isEqualIgnoreCase = myName.equalsIgnoreCase("orvyl");

    System.out.println(isEqualName + " " + isEqualIgnoreCase);
    }
}