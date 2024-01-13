// Abstract class with inheritance
abstract class Customer implements ShowQuality {
    private String name;

    // Constructor
    public Customer(String name) {
        this.name = name;
    }

    // Getter and setter methods for encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Method using polymorphism
    public void printInfo() {
        System.out.println("Customer: " + getName());
    }
}

