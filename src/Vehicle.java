public abstract class Vehicle {
    public String brand;
    public String model;
    public int year;

    public Vehicle(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    abstract double calculateFuelEfficiency();
}