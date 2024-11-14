package purchassystem;
//libarary
import java.util.Scanner;
//class name
public class Purchassystem {

    
    public static void main(String[] args) {
        
        //Declare variable
        String itemName;
        int itemChoice;
        int quantity;
        double pricePerItem;
        double totalPrice;
        Scanner input = new Scanner(System.in);
        
        // Step 1: Display item options
        System.out.println("Select an item:");
        System.out.println("1. Samsung Galaxy Z Flip6 (Fixed price: $4999 per item)");
        System.out.println("2. Samsung Galaxy Z Fold6 (Fixed price: $7299 per item)");
        System.out.println("3. Samsung Galaxy A55 (Fixed price: $1499 per item)");
        System.out.println("4. Samsung Galaxy S24 Ultra (Fixed price: $4949 per item)");
        itemChoice = input.nextInt();
        
        // Determine the item name and price per item 
        if (itemChoice == 1) {
            itemName = "Samsung Galaxy Z Flip6";
            pricePerItem = 4999.0;
        } else if (itemChoice == 2) {
            itemName = "Samsung Galaxy Z Fold6";
            pricePerItem = 7299.0;
        } else if (itemChoice == 3) {
            itemName = "Samsung Galaxy A55";
            pricePerItem = 1499.0;
        } else if (itemChoice == 4) {
            itemName = "Samsung Galaxy S24 Ultra";
            pricePerItem = 4949.0;
        } else {
            itemName = "Unknown";
            pricePerItem = 0.0;
            System.out.println("Invalid choice. No valid item selected.");
        }

        // Step 2: Accept quantity from the user
        System.out.print("Enter the quantity: ");
        quantity = input.nextInt();

        // Formula total price
        totalPrice = pricePerItem * quantity;

        // Step 3: Provide output to the user
        System.out.println("\n--- Order Summary ---");
        System.out.println("Item Name: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per Item: $" + pricePerItem);
        System.out.println("Total Price: $" + totalPrice);

        // Close the scanner
        input.close();
    }
    
}
