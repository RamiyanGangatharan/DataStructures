public class Cheese {

    private boolean stinky;
    private String colour;
    private int height;
    private int width;
    private int depth;

    public boolean isStinky() { return stinky; }
    public void setStinky(boolean stinky) { this.stinky = stinky; }
    public String getColour() { return colour; }

    public void setColour(String colour) { this.colour = colour;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getDepth() { return depth; }

    public void setDepth(int depth) { this.depth = depth; }



    public Cheese() {
        this.stinky = false;
        this.colour = "Orange";
        this.height = 5;
        this.width = 5;
        this.depth = 5;
    }

    public Cheese(boolean s, String c, int h, int w, int d)
    {
        this.stinky = s;
        this.colour = c;
        this.height = h;
        this.width = w;
        this.depth = d;
    }

    @Override
    public String toString() {
        return this.width + " cm wide " + "cheese";
    }

    public void cutInHalfWidth() {
        this.width /= 2;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Cheese cheddar = new Cheese();
        System.out.println(cheddar);
        cheddar.cutInHalfWidth();
        System.out.println(cheddar);
    }
}