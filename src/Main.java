import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Inventory> garage = new ArrayList<>();
        while (true) {
            Inventory inventory = new Inventory();
            System.out.println("1.) Add some Inventory\n2.) Remove some inventory\n3.) Update some inventory quantity. \n4.) View Inventory.");
            String userInput = scanner.nextLine();
            if (userInput.equals("1")) {
                String item = inventory.getItem(scanner);
                int quantity = inventory.getQuantity(scanner);
                Inventory thing = new Inventory(item, quantity);
                garage.add(thing);

            } else if (userInput.equals("2")) {
                System.out.println("Enter item number to remove it. ");
                int numToRemove = Integer.parseInt(scanner.nextLine());
                garage.remove(numToRemove - 1);

            } else if (userInput.equals("3")) {
                System.out.println("What number would you like to update? ");
                int idx = Integer.parseInt(scanner.nextLine());
                System.out.println("What would you like to change to: ");
                int toUpdate = Integer.parseInt(scanner.nextLine());
                Inventory item = garage.get(idx - 1);
                item.quantity = toUpdate;

            } else if( userInput.equals("4")){
                for (Inventory item : garage) {
                    System.out.printf("%d: %s \n", item.quantity, item.item);
                }
                System.out.println("----------------------");
            } else {
                System.out.println("Not a valid choice.");
            }
        }
    }
}
