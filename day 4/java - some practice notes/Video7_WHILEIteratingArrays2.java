
class Video7_WHILEIteratingArrays2 {

    public static void main(String[] args) {
                         //   1         2        3       4          5
        String[] names = {"David", "Alenere", "Ace", "Jasfer", "Patrick"}; // [] to create an array
        int i = 0;

        while(i < names.length) { //automate so that you don't need to update value again nad again
            System.out.println(names[i]); //here we do not need to type again and again
            i++;
        }
    }
}