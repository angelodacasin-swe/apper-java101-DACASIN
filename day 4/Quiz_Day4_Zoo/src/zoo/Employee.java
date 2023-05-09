package zoo;

import zoo.Animal;

public class Employee {
    private String nameEmployee;
    private double salaryEmployee;

    // Initialize the variables
    public Employee(String nameEmployee, double salaryEmployee) {
        this.nameEmployee = nameEmployee;
        this.salaryEmployee = salaryEmployee;
    }

    // Use getters to retrieve values
    public String getName() {
        return nameEmployee;
    }
    public double getSalary() {
        return salaryEmployee;
    }
    public void feedAnimal(Animal animal) {
    }
}