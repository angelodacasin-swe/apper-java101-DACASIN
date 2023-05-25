package zoo.person;

import zoo.Animal;

public class Employee extends Human {
    double salary;

    void feedAnimal(Animal animal) {
        animal.chewFood();
    }
}
