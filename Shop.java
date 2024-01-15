
import java.util.*;

public class Shop implements Admin { // kaning shop nga class kay naka implement sa
    Scanner scan = new Scanner(System.in);

    int size;// kani nga size kay nag count sa device nga add
    int index; // kani nga index nga variable kay gamiton para access sa devices nga na add
    Device[] device = new Device[100];// kani kay array object aron maka store og multiple Object
    Buyer buyer = new Buyer(); // kani kay nag create og object

    @Override
    public void addDevice() {
        try {
            System.out.print("Enter how many device you want to add: ");
            size = scan.nextInt();

            for (int i = 0; i < size; ++i) {
                device[i + index] = new Device();
                System.out.print("Enter brand: ");
                scan.nextLine();
                device[i + index].setBrand(scan.nextLine());
                System.out.print("Enter model: ");
                device[i + index].setModel(scan.nextLine());
                System.out.print("Enter os: ");
                device[i + index].setOs(scan.nextLine());
                System.out.print("Enter ram: ");
                device[i + index].setRam(scan.nextInt());
                System.out.print("Enter storage: ");
                device[i + index].setStorage(scan.nextInt());
                System.out.print("Enter price: ");
                device[i + index].setPrice(scan.nextDouble());
            }
            System.out.println("Successfully Added..");
            index += size;
        } catch (Exception e) {
            System.out.println("Invalid input..");
        }
    }

    public void display() {
        System.out.println();
        System.out.println("<<<<<<<<<<<<<<<<<<<DEVICES>>>>>>>>>>>>>>>>>>>>>>>");
        for (int i = 0; i < index; i++) {
            System.out.println();
            System.out.println("Device number: " + (i + 1));
            System.out.println("Brand: " + device[i].getBrand());
            System.out.println("Model: " + device[i].getModel());
            System.out.println("Os: " + device[i].getOs());
            System.out.println("Ram: " + device[i].getRam());
            System.out.println("Storage: " + device[i].getStorage());
            System.out.println("Price: " + device[i].getPrice());
            System.out.println();
        }
        System.out.println("<<<<<<<<<<<<<<<<<<<WELCOME>>>>>>>>>>>>>>>>>>>>>>>");

    }

    public void sell(String name, String brand) {
        buyer.setName(name);
        buyer.setBrand(brand);
        for (int i = 0; i < index; i++) {
            if (buyer.getBrand(i).equals(device[i].getBrand())) {
                System.out.println("RECEIPT..");
                System.out.println("Brand: " + device[i].getBrand());
                System.out.println("Model: " + device[i].getModel());
                System.out.println("Os: " + device[i].getOs());
                System.out.println("Ram: " + device[i].getRam());
                System.out.println("Storage: " + device[i].getStorage());
                System.out.println("Price: " + device[i].getPrice());

            } else
                System.out.println("No device found..");
        }
    }

    public void viewHistory() {
        System.out.println("<<<<<<<<<<<<<<<<<<<HISTORY>>>>>>>>>>>>>>>>>>>>>>>");
        for (int i = 0; i < buyer.size(); i++) {
            for (int j = 0; j < index; j++) {
                if (buyer.getBrand(i).equals(device[j].getBrand())) {
                    System.out.println();
                    System.out.println("RECEIPT..");
                    System.out.println("Buyer name: " + buyer.getName(i));
                    System.out.println("Brand: " + device[j].getBrand());
                    System.out.println("Model: " + device[j].getModel());
                    System.out.println("Os: " + device[j].getOs());
                    System.out.println("Ram: " + device[j].getRam());
                    System.out.println("Storage: " + device[j].getStorage());
                    System.out.println("Price: " + device[j].getPrice());
                }
            }

        }
        System.out.println("<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>");
    }

}
