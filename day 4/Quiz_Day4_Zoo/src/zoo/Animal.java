package zoo;

public class Animal {
    private String nameAnimal;
    private String typeAnimal;
    private String foodAnimal;

    // Initialize the variables
    public Animal(String nameAnimal, String typeAnimal, String foodAnimal) {
        this.nameAnimal = nameAnimal;
        this.typeAnimal = typeAnimal;
        this.foodAnimal = foodAnimal;
    }

    // Use getters to retrieve values
    public String getName() {
        return nameAnimal;
    }
    public String getType() {
        return typeAnimal;
    }
    public String getFood() {
        return foodAnimal;
    }

    // Call value for makeSound() and chewFood() as assigned.
    public void makeSound() {
    }
    public void chewFood() {
    }
}