import java.util.Scanner;

public class Inventory {
    String item;
    int quantity;

    public Inventory(String item, int quantity){
        this.item = item;
        this.quantity = quantity;
    }

    public Inventory(){}


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

    public void updateGarage(Scanner scanner){
        System.out.println("What number would you like to update? ");
        int idx = Integer.parseInt(scanner.nextLine());
        System.out.println("What would you like to change to: ");
        int toUpdate = Integer.parseInt(scanner.nextLine());
        Inventory item = Main.garage.get(idx - 1);
        item.quantity = toUpdate;

    }

    public void printOutInventory() {
        for (Inventory item : Main.garage) {
            System.out.printf("%d: %s \n", item.quantity, item.item);
        }
        System.out.println("----------------------");
    }

    public void removeInventory(Scanner scanner) {
        System.out.println("Enter item number to remove it. ([-1] to cancel)");
        int numToRemove = Integer.parseInt(scanner.nextLine());
        if (numToRemove > 0) {
            Main.garage.remove(numToRemove - 1);
        }

    }

    public void addItem(Scanner scanner){
        String item = getItem(scanner);
        int quantity = getQuantity(scanner);
        Inventory thing = new Inventory(item, quantity);
        Main.garage.add(thing);
    }
}
