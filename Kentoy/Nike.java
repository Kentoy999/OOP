// Concrete class implementing an interface and extending an abstract class
    class Nike extends Customer {
    private int nikeSize;
    private String nikeColor;
    
    // Constructor
    public Nike(String name, int nikeSize, String nikeColor) {
        super(name);
        this.nikeSize = nikeSize;
        this.nikeColor = nikeColor;
    }

    // Getter and setter methods for encapsulation
    public int getNikeSize() {
        return nikeSize;
    }

    public void setNikeSize(int nikeSize) {
        this.nikeColor = nikeColor;
    }
    // Getter and setter methods for encapsulation
    public String getNikeColor() {
        return nikeColor;
    }

    public void setNikeColor(String nikeColor) {
        this.nikeColor = nikeColor;
    }

    // Implementation of the performRole method from the Role interface
    @Override
    public void ShowQ() {
        System.out.println("JUST DO IT");
        System.out.println("Nike Size: " + getNikeSize());
        System.out.println("Nike Color: " + getNikeColor());
    }

    // Method using polymorphism
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Brand: Nike");
        System.out.println("Nike Size: " + getNikeSize());
        System.out.println("Nike Color: " + getNikeColor());
    }
}
