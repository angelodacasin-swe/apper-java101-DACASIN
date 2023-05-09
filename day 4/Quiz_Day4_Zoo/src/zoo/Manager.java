package zoo;

import zoo.Employee;

public class Manager {
    private String nameManager;
    private int ageManager;
    private String titleManager;

    // Initialize the variables
    public Manager(String nameManager, int ageManager, String titleManager) {
        this.nameManager = nameManager;
        this.ageManager = ageManager;
        this.titleManager = titleManager;
    }

    // Use getters to retrieve values
    public String getName() {
        return nameManager;
    }
    public int getAge() {
        return ageManager;
    }
    public String getTitle() {
        return titleManager;
    }
    public double employeeSalary(Employee employee) {
        return employee.getSalary();
    }
}
