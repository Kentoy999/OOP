// Concrete class implementing an interface and extending an abstract class
    class Converse extends Customer {
    private int converseSize;
    private String converseColor;
    
    // Constructor
    public Converse(String name, int converseSize, String converseColor) {
        super(name);
        this.converseSize = converseSize;
        this.converseColor = converseColor;
    }

    // Getter and setter methods for encapsulation
    public int getConverseSize() {
        return converseSize;
    }

    public void setConverseSize(int converseSize) {
        this.converseColor = converseColor;
    }
    // Getter and setter methods for encapsulation
    public String getConverseColor() {
        return converseColor;
    }

    public void setConverseColor(String converseColor) {
        this.converseColor = converseColor;
    }

    // Implementation of the performRole method from the Role interface
    @Override
    public void ShowQ() {
        System.out.println("Walk your own path in Converse shoes.");
        System.out.println("Nike Size: " + getConverseSize());
        System.out.println("Nike Color: " + getConverseColor());
    }

    // Method using polymorphism
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Brand: Converse");
        System.out.println("Converse Size: " + getConverseSize());
        System.out.println("Converse Color: " + getConverseColor());
    }
}
