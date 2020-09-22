package firwanaa;

/**
 * ShipmentList class represent Array list of Shipment objects,
 * which take and find destination name and value and populate the arraylist.
 * * @author Alqassam Firwana.
 */
import java.util.*;
public class ShipmentList {
    /**
     * Scanner object
     */
    Scanner sc = new Scanner(System.in);
    /**
     * Declaring Arraylist of Shipment objects
     */
    private ArrayList<Shipment> ShipmentList = new ArrayList<>();

    /**
     * No-param Constructor for Shipmentlist.
     */
    public ShipmentList() {
    }

    /**
     * Get method that take index
     * @param index
     * @return value of that index
     */
    public Shipment get(int index) {
        return ShipmentList.get(index);
    }

    /**
     * Add method to populate the arraylist and add value to existing shipments.
     * @param shipment
     */
    public void add(Shipment shipment) {
        int x = findShipment(shipment.destination);
        if (x > 0) {

            for (Shipment s : ShipmentList) {
                if (s.destination == shipment.destination) {
                    double v = sc.nextDouble();
                    s.addShipValue(v);
                    break;
                }
            }
        } else {
            double v2 = sc.nextDouble();
            ShipmentList.add(shipment);
            shipment.setShipValue(v2);
        }
    }

    /**
     * find shipment method that check if shipment already exist in arraylist or not
     * @param dest destination
     * @return positive int if exist or -1 if not.
     */
    public int findShipment(Destination dest) {
        for (Shipment shipment : ShipmentList) {
            if (ShipmentList.toString().contains(dest.Name))
                return 7;
        }
        return -1;
    }

    /**
     * length method
     * @return Shipmentlist size.
     */
    public int length() {
        return ShipmentList.size();
    }

    /**
     * toString method for shipmentlist
     * @return Formatted string of Arraylist objects and max value.
     */
    @Override
    public String toString() {
        double max = 0;
        String maxName = "";
        System.out.println("This Week's Shipments: ");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();

        for (Shipment obj2 : ShipmentList) {
            if (max < obj2.getShipValue()) {
                max = obj2.getShipValue();
                maxName = obj2.destination.Name;
            }
        }
        
        for (Shipment obj : ShipmentList) {
            sb.append(String.format("%s $%.2f", obj.destination.Name,
                    obj.getShipValue()) + "\n");
        }
        
        sb1.append("\n" + "Most Valuable Shipment: ");
        sb1.append(String.format("%s $%.2f", maxName, max));
        return sb.toString() + sb1;
    }

}
