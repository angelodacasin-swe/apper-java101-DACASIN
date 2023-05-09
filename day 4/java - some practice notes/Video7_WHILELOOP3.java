
class Video7_WHILELOOP3 {

    public static void main(String[] args) {
        String[] names = {"David",
                        "Alenere",
                        "Patrick",
                            "Ace",
                        "Jasfer"};
        int i = 0;

        while (i < names.length) {

            if(names[i].equalsIgnoreCase("Patrick")) {
                System.out.println("We Found " + names[i]);
                break; //break na agad pagkakita kay Patrick
            }
            i++;
        }
    }
}

