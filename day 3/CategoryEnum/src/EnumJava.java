
class EnumJava {
    public enum CategoryEnum {
        MEN(13.57),
        WOMEN(20.45),
        KID(45.6),
        GRANDMA(56.67),
        GRANDPA(3.56);
        private final double price;
        CategoryEnum(double price) {
            this.price = price;
        }
        public double getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {
        CategoryEnum chosenCategory = CategoryEnum.KID; // I choose the category KID

        double price;
        switch (chosenCategory) {
            case MEN: price = 13.57;break;
            case WOMEN: price = 20.45; break;
            case KID: price = 45.6; break;
            case GRANDMA: price = 56.67; break;
            case GRANDPA: price = 3.56; break;
            default:
                throw new IllegalStateException("Unexpected value: " + chosenCategory);
        }
        System.out.println("The price for the chosen category " + chosenCategory + " is " + price);
    }
}

