package firwanaa;
/**
 * The Destination Enum class represents provinces names
 * and name codes and initial value for each destination.
 *
 * @author Alqassam Firwana.
 */
public enum Destination {
    /**
     * Destination name and values.
     */
    AB("Alberta", 21.5),
    BC("British Columbia", 25.95),
    MB("Manitoba", 18.95),
    NB("New Brunswick", 21.95),
    NL("Newfoundland & Labrador", 24.95),
    NS("Nova Scotia", 22.5),
    NT("Northwest Territories", 27.95),
    NU("Nunavut", 27.95),
    ON("Ontario", 12.49),
    PE("Prince Edward Island", 23.49),
    QC("Quebec", 16.95),
    SK("Saskatchewan", 21.95),
    YT("Yukon", 29.95);

    /**
     * Variables Name and Cost.
     */
    String Name;
    double Cost;

    /**
     * 2-param Constructor.
     * @param n nam
     * @param c Cost
     */
    private Destination(String n, double c) {
        this.Name = n;
        this.Cost = c;
    }

    /**
     * Getter for name.
     * @return name
     */
    public String getName() {
        return Name;
    }

    /**
     * Getter for Cost.
     * @return cost.
     */
    public double getCost() {
        return Cost;
    }

    /**
     * Setter for name.
     * @param n name.
     */
    public void setName(String n) {
        this.Name = n;
    }

    /**
     * Setter for cost.
     * @param c cost.
     */
    public void setCost(double c) {
        this.Cost = c;
    }

    /**
     * toString method for Destination class
     * @return String of name and cost
     */
    @Override
    public String toString() {
        return "Destination{" +
                "Name='" + Name + '\'' +
                ", Cost=" + Cost +
                '}';
    }
}
