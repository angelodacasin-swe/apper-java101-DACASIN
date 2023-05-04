class OddEven {
    public static void countOddEven(int[] nums) { //Create a method that we will call later. This method takes an integer array as a parameter.

        System.out.println(); // Just a line space for readability
        System.out.println("Welcome to Homework 3 - OddEven"); // Introduction message
        System.out.println(); // Just a line space for readability

        int oddCount = 0; // Initialize an integer named oddCount. The count starts at 0.
        int evenCount = 0; // Initialize an integer named evenCount. The count starts at 0.

        for(int i = 0; i < nums.length; i++) {  // Call a for loop that defines and initializes the variable i. It will start i at 0 until "i" < nums.length array
            // Conditional Statements. This will check if the number divided by 2 has a remainder. If it doesn't, it's ODD. If it has, it's EVEN. The ++ tells us to iterate to the next nums
            if(nums[i] % 2 != 0) {
                oddCount++;
            } else {
                evenCount++; // NOTE: This can also be seen as nums[i] % 2 == 0. Meaning, if the remainder is 0, it is divisible by the number. Thus, it is EVEN.
            }
        }
        // This will print the numbers that Odd/Even numbers.
        System.out.println("Odd: " + oddCount);
        System.out.println("Even: " + evenCount);
    }


    public static void main(String[] args) { // We have already created a method. Now, let's call the program using that method.
        int[] nums = new int[]{1, 234, 2, 4, 56, 17, 50, 1235, 6, 1, 23, 48, 47, 34}; //create an array of integers with the specified values
        countOddEven(nums); // Call the countOddEven method. The "nums" array is its parameter.

    }
}