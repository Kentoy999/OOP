 import java.util.Scanner;
// Main class
public class Shoes {
    public static void main(String[] args) {
        // Create Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Get user input for role selection
        System.out.println("Choose Brand: ");
        System.out.println("1. Nike");
        System.out.println("2. Vans");
        System.out.println("3. Converse");
        System.out.println("4. Adidas");
        System.out.println("5. Puma");
        int choice = scanner.nextInt();

        // Process user's choice
        switch (choice) {
            case 1:
                // Get user input for mage player's name and skill
                System.out.print("Enter Customer Name: ");
                String nikeName = scanner.next();
                System.out.print("Enter the Shoe Size: ");
                int nikeSize = scanner.nextInt();
                System.out.print("Enter the Shoe Color: ");
                String nikeColor = scanner.next();
                // Creating an instance of Mage with user input
                Nike nike = new Nike(nikeName, nikeSize, nikeColor);
                System.out.println("");
                // Using polymorphism to call the overridden method
                nike.printInfo();
                System.out.println("");
                // Using the interface method
                nike.ShowQ();
                break;
            case 2:
                // Get user input for mage player's name and skill
                System.out.print("Enter Customer Name: ");
                String vansName = scanner.next();
                System.out.print("Enter the Shoe Size: ");
                int vansSize = scanner.nextInt();
                System.out.print("Enter the Shoe Color: ");
                String vansColor = scanner.next();
                // Creating an instance of Mage with user input
                Vans vans = new Vans(vansName, vansSize, vansColor);
                System.out.println("");
                // Using polymorphism to call the overridden method
                vans.printInfo();
                System.out.println("");
                // Using the interface method
                vans.ShowQ();
                break;
            case 3:
                // Get user input for mage player's name and skill
                System.out.print("Enter Customer Name: ");
                String converseName = scanner.next();
                System.out.print("Enter the Shoe Size: ");
                int converseSize = scanner.nextInt();
                System.out.print("Enter the Shoe Color: ");
                String converseColor = scanner.next();
                // Creating an instance of Mage with user input
                Converse converse = new Converse(converseName, converseSize, converseColor);
                System.out.println("");
                // Using polymorphism to call the overridden method
                converse.printInfo();
                System.out.println("");
                // Using the interface method
                converse.ShowQ();
                break;
            case 4:
                // Get user input for mage player's name and skill
                System.out.print("Enter Customer Name: ");
                String adidasName = scanner.next();
                System.out.print("Enter the Shoe Size: ");
                int adidasSize = scanner.nextInt();
                System.out.print("Enter the Shoe Color: ");
                String adidasColor = scanner.next();
                // Creating an instance of Mage with user input
                Adidas adidas = new Adidas(adidasName, adidasSize, adidasColor);
                System.out.println("");
                // Using polymorphism to call the overridden method
                adidas.printInfo();
                System.out.println("");
                // Using the interface method
                adidas.ShowQ();
                break;
            case 5:
                // Get user input for mage player's name and skill
                System.out.print("Enter Customer Name: ");
                String pumaName = scanner.next();
                System.out.print("Enter the Shoe Size: ");
                int pumaSize = scanner.nextInt();
                System.out.print("Enter the Shoe Color: ");
                String pumaColor = scanner.next();
                // Creating an instance of Mage with user input
                Puma puma = new Puma(pumaName, pumaSize, pumaColor);
                System.out.println("");
                // Using polymorphism to call the overridden method
                puma.printInfo();
                System.out.println("");
                // Using the interface method
                puma.ShowQ();
                break;
            default:
                System.out.println("Invalid choice. Please choose between 1 and 5.");
        }

        // Close the Scanner
        scanner.close();
    }
}