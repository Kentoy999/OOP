// Concrete class implementing an interface and extending an abstract class
    class Puma extends Customer {
    private int pumaSize;
    private String pumaColor;
    
    // Constructor
    public Puma(String name, int pumaSize, String pumaColor) {
        super(name);
        this.pumaSize = pumaSize;
        this.pumaColor = pumaColor;
    }

    // Getter and setter methods for encapsulation
    public int getPumaSize() {
        return pumaSize;
    }

    public void setPumaSize(int pumaSize) {
        this.pumaColor = pumaColor;
    }
    // Getter and setter methods for encapsulation
    public String getPumaColor() {
        return pumaColor;
    }

    public void setPumaColor(String pumaColor) {
        this.pumaColor = pumaColor;
    }

    // Implementation of the performRole method from the Role interface
    @Override
    public void ShowQ() {
        System.out.println("Step into the wild side, where fashion meets fierce.");
        System.out.println("Puma Size: " + getPumaSize());
        System.out.println("Puma Color: " + getPumaColor());
    }

    // Method using polymorphism
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Brand: Puma");
        System.out.println("Puma Size: " + getPumaSize());
        System.out.println("Puma Color: " + getPumaColor());
    }
}
