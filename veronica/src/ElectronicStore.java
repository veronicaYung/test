import java.util.Scanner;

public class ElectronicStore {
    String name;


    Desktop desktops[] = new Desktop[3];
    Laptop laptops[] = new Laptop[3];
    Fridge fridges[] = new Fridge[3];

    public ElectronicStore(String name) { //constructor --> initializes
        this.name = name;
        desktops[0] = new Desktop(3.5, 8, 500, true);
        desktops[1] = new Desktop(4.5, 10, 600, false);
        desktops[2] = new Desktop(5.5, 12, 800, false);


        laptops[0] = new Laptop(3.1, 32, 500, true, 7);
        laptops[1] = new Laptop(4.1, 64, 800, true, 9);
        laptops[2] = new Laptop(5.1, 128, 900, false, 13);

        fridges[0] = new Fridge(15.6, false, "gray");
        fridges[1] = new Fridge(13, true, "orange");
        fridges[2] = new Fridge(13.5, false, "black");
    }

    public void printStock() {
        for (int i = 0; i < 3; i++) {
            System.out.println(desktops[i]);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(laptops[i]);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(fridges[i]);
        }


    }

    public boolean searchStock(String userInput) {
        userInput = userInput.toLowerCase();
        for (int i = 0; i < desktops.length; i++) {
            System.out.println(desktops[i].toString());
            if (desktops[i].toString().toLowerCase().contains(userInput)) {
                return true;
            }
            if (laptops[i].toString().toLowerCase().contains(userInput)) {
                return true;
            }
            if (fridges[i].toString().toLowerCase().contains(userInput)) {
                return true;
            }

        }

        return false;
    }

    public String ElectricStoreTester() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a term to search for: ");
        String userInput = input.nextLine();

        while (!userInput.equals("quit")) {
            System.out.println(searchStock(userInput));
            System.out.println("Enter a term to search for: ");
            userInput = input.nextLine();
        }

        return (" ");
    }
}
