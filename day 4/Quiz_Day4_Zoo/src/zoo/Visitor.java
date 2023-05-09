package zoo;
public class Visitor {
    private String nameVisitor;
    private int ageVisitor;

    // Initialize the variables
    public Visitor(String nameVisitor, int ageVisitor) {
        this.nameVisitor = nameVisitor;
        this.ageVisitor = ageVisitor;
    }

    // Use getters to retrieve values
    public String getName() {
        return nameVisitor;
    }
    public int getAge() {
        return ageVisitor;
    }
}