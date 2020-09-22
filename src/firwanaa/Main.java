package firwanaa;

import java.util.*;

/**
 * The Shipment driver that prompt user and take user input.
 *  @author Alqassam Firwana.
 */
public class Main {


    public static void main(String[] args) {
        // write your code here
        /**
         * Scanner object
         */
        Scanner sc = new Scanner(System.in);
        /**
         * Shipmentlist object
         */
        ShipmentList sl1 = new ShipmentList();
        /**
         * do-while loop that asking for user input and calling add method to add shipments
         */
        char more = 'Y';
        do {
            Shipment s1 = new Shipment();
            System.out.println("Enter Destination Province Code: ");
            String name = (sc.next().toUpperCase());
            for (Destination b : Destination.values()) {
                if (b.name().equalsIgnoreCase(name)) {
                    s1.destination = b;
                }
            }
            System.out.println("Enter The Value of The Shipment: ");
            sl1.add(s1);
            System.out.print("Add another? (Y/N) ");
            more = sc.next().toUpperCase().charAt(0);
        } while (more == 'Y');
        System.out.println(sl1.toString());
    }
}

