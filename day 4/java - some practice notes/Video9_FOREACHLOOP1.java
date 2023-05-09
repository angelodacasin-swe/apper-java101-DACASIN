
class Video9_FOREACHLOOP1 {

    public static void main(String[] args) {
        String[] names = {"David",
                "Alenere",
                "Jasfer",
                "Ace",
                "Jaymar"};
        // Read as for each x sa loob ng names, call it.
        for (String x : names) { // good thing here is automated adjustment. No need to use names.length
            System.out.println(x);
        }
    }
}