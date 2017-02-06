import java.util.Scanner;

public class Inventory {
    String item;
    int quantity;

    public Inventory(String item, int quantity){
        this.item = item;
        this.quantity = quantity;
    }

    public Inventory(){}

    public int getQuant() {
        return this.quantity;
    }

    public String getItem(Scanner scanner){
        System.out.print("What would you like to add: ");
        item =  scanner.nextLine();
        return item;
    }

    public int getQuantity(Scanner scanner) {
        System.out.print("How many to add: ");
        int quantity = Integer.parseInt(scanner.nextLine());
        return quantity;
    }



}
