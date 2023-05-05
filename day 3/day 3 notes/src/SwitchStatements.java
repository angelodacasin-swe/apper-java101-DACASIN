
class SwitchStatements {

    public static void main(String[] args) {
        // Conditional Statements
        // sound of animals
        // Dog arf arf
        // Cat meow meow
        // Goat meeh meeh
        // Cow mooooh
//
//        String animal = "lion";
        Animal animal = Animal.DOG;

//            if (animal.equals("dog")) {
//                System.out.println("arf arf");
//            } else if (animal.equals("cat")) {
//                System.out.println("meow meow");
//            } else if (animal.equals("goat")) {
//                System.out.println("meeeeh");
//            } else if (animal.equals("cow")) {
//                System.out.println("moo");
//            } else {
//                System.out.println("Yehey!");
//            }
//
        switch (animal) {
            case DOG:
                System.out.print("arf arf");
                break;
            case CAT:
                System.out.print("meow meow");
                break;
            case GOAT:
                System.out.print("meeeh");
                break;
            case COW:
                System.out.print("moo");
                break;
            default:
                System.out.println("Yehey!");
                // pag wala, for example lion, default value is yehey
        }
    }
}
//        String promoCode = "GCASH_ANNIV_2023";
//
//        switch(promoCode) {
//            case"GCASH_ANNIV_2023":
//                System.out.println("discount 1");
//            case "GCASH_ANNIV_2022":
//                System.out.println("discount 2");

        //enum use is to set possible values to use na hindi method
        //dapat nasa labas ka ng void main
        public enum Animal {
            DOG, CAT, GOAT, COW

}