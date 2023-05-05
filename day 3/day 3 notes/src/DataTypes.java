
class DataTypes {
    /* Global Variables are declared in the class
    Local Variable - value within just a method */
    static int age; //Global Variable pag nasa labas. Lahat ng Local Variable dapat initialize muna
    static double salary;
    static boolean isHappy; // default value of boolean is false. Default variable can affect the outcome/judgment.
    static char favoriteLetter; //ask key value na hinihingi
    static float weight;
    static long distance;
    static int wrapperAge; //put value to be able to add to 10
    static boolean wrapperIsHappy; //Bakit kailangan ang wrapper? If wrapper immutable (hindi na uupdate),

    public static void main(String[] args) {
        //Zero value by default for data types. The reason why we need to initialize. "Ano value niya?
        System.out.println(age);
        System.out.println(salary);
        System.out.println(isHappy);
        System.out.println(favoriteLetter);
        System.out.println(weight);
        System.out.println(distance);

        //Wrapper -- every time we go to a variable which has no value, it will result to null
        System.out.println(age + " " + wrapperAge);
        System.out.println(isHappy + " " + wrapperIsHappy);
        System.out.println(age + 10);
        // System.out.println(wrapperAge + 10);

        //TRIAL pass by value
        //System.out.println(theAge);
        //displayAgeInAFancyWay(theAge);

        //System.out.println("value of theAge calling fancy method: " + theAge);
        System.out.println("+++");

        //TRIAL pass by reference
        //integer[] ages = new Integer[]{100};
       // System.out.println(ages[0]);
        //displayAgesinaFancyWay(ages);

        //System.out.println("value of theAge calling fancy method: " + ages[0]);
        System.out.println("+++");

        //primitive to wrapper
        int numUsers = 100;
        Integer numberOfUsers = numUsers;
        System.out.println(numberOfUsers.intValue());


        int a = 9;
        int b = 10;
        int c = 78;

        System.out.println((a + b) * c % 4);

        System.out.println(c++ + " " + ++c);
        System.out.println(c);
    }
}
