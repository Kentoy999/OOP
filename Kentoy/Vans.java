// Concrete class implementing an interface and extending an abstract class
    class Vans extends Customer {
    private int vansSize;
    private String vansColor;
    
    // Constructor
    public Vans(String name, int vansSize, String vansColor) {
        super(name);
        this.vansSize = vansSize;
        this.vansColor = vansColor;
    }

    // Getter and setter methods for encapsulation
    public int getVansSize() {
        return vansSize;
    }

    public void setVansSize(int vansSize) {
        this.vansColor = vansColor;
    }
    // Getter and setter methods for encapsulation
    public String getVansColor() {
        return vansColor;
    }

    public void setVansColor(String vansColor) {
        this.vansColor = vansColor;
    }

    // Implementation of the performRole method from the Role interface
    @Override
    public void ShowQ() {
        System.out.println("Step into style with Vans");
        System.out.println("Vans Size: " + getVansSize());
        System.out.println("Vans Color: " + getVansColor());
    }

    // Method using polymorphism
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Brand: Vans");
        System.out.println("Vans Size: " + getVansSize());
        System.out.println("Vans Color: " + getVansColor());
    }
}
