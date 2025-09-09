public class Vehicle {
    private String make;
    private String model;
    private String colour;
    private String engine;
    private int year;
    private boolean isNew;

    // Getters and setters
    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getColour() { return colour; }
    public void setColour(String colour) { this.colour = colour; }

    public String getEngine() { return engine; }
    public void setEngine(String engine) { this.engine = engine; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public boolean isNew() { return isNew; }
    public void setNew(boolean aNew) { isNew = aNew; }

    // Constructor with parameters
    public Vehicle(String make, String model, String colour, String engine, int year, boolean isNew) {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.engine = engine;
        this.year = year;
        this.isNew = isNew;
    }

    public Vehicle() {
        this(
            "Toyota",
            "Sienna",
            "Green",
            "1MZ-FE",
            2002,
            false
        );
    }

    @Override
    public String toString() {
        return year + " " + make + " " + model + " (" + colour + ", Engine: " + engine + ", New: " + isNew + ") \n";
    }

    /**
     * Activity 1B2: create a class with a couple fields, a constructor, getters, setters,
     * and another type of method. In addition to this, create a ToString method to make output nice.
     * @param args A string array of arguments
     */
    public static void main(String[] args) {
        Vehicle defaultCar = new Vehicle();

        Vehicle corvette = new Vehicle(
            "Chevrolet",
            "Corvette",
            "Red",
            "LT2 V8",
            2023,
            true
        );

        Vehicle M4 = new Vehicle(
            "BMW",
            "M4 Competition",
            "Nardo Grey",
            "S58 I6",
            2025,
            true
        );


        System.out.println(defaultCar);
        System.out.println(corvette);
        System.out.println(M4);

    }
}
