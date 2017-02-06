import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Inventory> garage = new ArrayList<>();
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            Inventory inventory = new Inventory();
            System.out.println("1.) Add some Inventory\n2.) Remove some inventory\n3.) Update some inventory quantity. \n4.) View Inventory.");
            String userInput = scanner.nextLine();
            if (userInput.equals("1")) {
                inventory.addItem(scanner);

            } else if (userInput.equals("2")) {
                inventory.removeInventory(scanner);

            } else if (userInput.equals("3")) {
                inventory.updateGarage(scanner);

            } else if( userInput.equals("4")){
                inventory.printOutInventory();

            } else {
                System.out.println("Not a valid choice.");
            }
        }
    }
}
