import java.util.Objects;

public class Burrito {
    private String size;
    private String protein;
    private String toppings;
    private String rice;
    private String beans;
    private boolean hasGuac;

    // Default Constructor
    public Burrito() { this.size = "small"; }

    // Custom Constructors
    /**
     * This is a custom constructor for just size and meat type
     * @param size size of the burrito
     * @param protein type of meat in the burrito
     */
    public Burrito(String size, String protein) {
        this.size = size;
        this.protein = protein;
    }

    /**
     * Full custom constructor for the burrito class
     * @param size size of the burrito
     * @param protein what kind of meat the customer wanted
     * @param rice what kind of rice the customer wanted
     * @param beans what kind of beans the customer wanted
     * @param toppings what toppings the burrito has
     * @param hasGuac if the burrito has guacamole
     */
    public Burrito(String size, String protein, String rice, String beans, String toppings, boolean hasGuac) {
        this.size = size;
        this.protein = protein;
        this.rice = rice;
        this.beans = beans;
        this.toppings = toppings;
        this.hasGuac = hasGuac;
    }

    /*
        GETTERS AND SETTERS FOR ALL ATTRIBUTES IN THE OBJECT
     */
    public String getSize() { return size; }
    public void setSize(String size) { this.size = size; }

    public String getProtein() { return protein; }
    public void setProtein(String protein) { this.protein = protein; }

    public String getToppings() { return toppings; }
    public void setToppings(String toppings) { this.toppings = toppings; }

    public String getRice() { return rice; }
    public void setRice(String rice) { this.rice = rice; }

    public String getBeans() { return beans; }
    public void setBeans(String beans) { this.beans = beans; }

    public boolean isHasGuac() { return hasGuac; }
    public void setHasGuac(boolean hasGuac) { this.hasGuac = hasGuac; }

    /**
     * This function calculates cost based off the items in the burrito (this was rushed so it may be inaccurate)
     * @return cost
     */
    public double getCost() {
        double cost = 0;

        if (Objects.equals(this.size, "small")) { cost += 5; }
        else if (Objects.equals(this.size, "large")) { cost += 7.50; }
        if (this.rice == null || this.rice.isEmpty() || this.beans == null || this.beans.isEmpty()) { cost += 1; }
        if (this.hasGuac) { cost += 2; }
        return cost;
    }

    /**
     * This function overrides the toString function where it makes my output more aesthetic
     * @return string
     */
    @Override public String toString() {
        return "Burrito [size=" + size +
                ", protein=" + protein +
                ", rice=" + rice +
                ", beans=" + beans +
                ", toppings=" + toppings +
                ", hasGuac=" + hasGuac +
                ", cost=$" + getCost() + "]";
    }
}
