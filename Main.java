import java.util.*;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner scan = new Scanner(System.in);
        boolean check = true;
        while (check == true) {
            try {
                int choice;

                shop.display();
                System.out.println();
                System.out.println("1.Sell\n2.Add device\n3.View sell history \n4.Exit");
                System.out.print("Enter the number of your choice: ");
                choice = scan.nextInt();
                System.out.println();
                if (choice == 1) {
                    if (shop.index  != 0) {
                         System.out.println();
                         System.out.println("<<<<<<<<<<<<<<<<<<<SALE DEVICE>>>>>>>>>>>>>>>>>>>>>>>");
                         System.out.print("Enter buyer name: ");
                         scan.nextLine();
                         String name = scan.nextLine();
                         System.out.print("Enter the brand: ");
                         String brand = scan.nextLine();
                         shop.sell(name, brand);
                         System.out.println();
                   }else
                       System.out.println("NO AVAILABLE DEVICE");
                } else if (choice == 2) {

                    System.out.println();
                    shop.addDevice();
                    System.out.println();
                } else if (choice == 3) {

                    shop.viewHistory();
                } else if (choice == 4) {
                    check = false;
                }
            } catch (Exception e) {
                System.out.println("Invalid input..");
            }
        }
    }

}