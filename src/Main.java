import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static ArrayList<Inventory> garage = new ArrayList<>();
    public static HashMap<String, String> passWords = new HashMap<>();
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        User user = new User();
        user.checkUser(scanner);

        while (true) {
            Inventory inventory = new Inventory();
            System.out.println("[1] Add Some Inventory\n" +
                    "[2] Remove Some Inventory\n" +
                    "[3] Update some inventory Quantity. \n" +
                    "[4] View Inventory. \n" +
                    "[5] Shut Down System");
            String userInput = scanner.nextLine();
            if (userInput.equals("1")) {
                inventory.addItem(scanner);

            } else if (userInput.equals("2")) {
                inventory.remove(scanner);

            } else if (userInput.equals("3")) {
                inventory.update(scanner);

            } else if( userInput.equals("4")){
                inventory.print();

            } else if(userInput.equals("5")) {
                inventory.warning(scanner);

            }else {
                System.out.println("Not a valid choice.");

            }
        }
    }
}
