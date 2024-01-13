// Concrete class implementing an interface and extending an abstract class
    class Adidas extends Customer {
    private int adidasSize;
    private String adidasColor;
    
    // Constructor
    public Adidas(String name, int adidasSize, String adidasColor) {
        super(name);
        this.adidasSize = adidasSize;
        this.adidasColor = adidasColor;
    }

    // Getter and setter methods for encapsulation
    public int getAdidasSize() {
        return adidasSize;
    }

    public void setAdidasSize(int adidasSize) {
        this.adidasColor = adidasColor;
    }
    // Getter and setter methods for encapsulation
    public String getAdidasColor() {
        return adidasColor;
    }

    public void setAdidasColor(String adidasColor) {
        this.adidasColor = adidasColor;
    }

    // Implementation of the performRole method from the Role interface
    @Override
    public void ShowQ() {
        System.out.println("With your Adidas stride in style, conquer with comfort");
        System.out.println("Adidas Size: " + getAdidasSize());
        System.out.println("Adidas Color: " + getAdidasColor());
    }

    // Method using polymorphism
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Brand: Adidas");
        System.out.println("Adidas Size: " + getAdidasSize());
        System.out.println("Adidas Color: " + getAdidasColor());
    }
}
