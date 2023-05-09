
class Video7_WHILEBreak1 {
    public static void main(String[] args) {
        int i = 0;

        while (i < 5) {
            System.out.println(i);
            i++;
            break; //break out of LOOP earlier than expected. Result is 0 here. Will use CONDITIONS in WHILE Loop
        }
        System.out.println("FINISHED");
    }
}