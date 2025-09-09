public class burritoOrder extends Burrito {
    /**
     *
     * @param size size of the burrito
     * @param protein what kind of meat the customer wanted
     * @param rice what kind of rice the customer wanted
     * @param beans what kind of beans the customer wanted
     * @param toppings what toppings the burrito has
     * @param hasGuac if the burrito has guacamole
     */
    public burritoOrder(String size, String protein, String rice, String beans, String toppings, boolean hasGuac)
    {
        this.setSize(size);
        this.setProtein(protein);
        this.setRice(rice);
        this.setBeans(beans);
        this.setToppings(toppings);
        this.setHasGuac(hasGuac);
    };

}
