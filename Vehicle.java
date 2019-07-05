public abstract class Vehicle {

    // Attributes
    private String brand;
    private int kilometers;

    // Constructor
    public Vehicle(String brand, int kilometers) {
        this.brand = brand;
        this.kilometers = kilometers;
    }

    // Getters & Setters
    public String getBrand() {
        return brand;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    // Methods
    public abstract String doStuff();
}
