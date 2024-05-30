public class Car extends Vehicle {
    public double milesDriven;
    public double fuelConsumed;

    public Car(String brand, String model, int year, double milesDriven, double fuelConsumed) {
        super(brand, model, year);
        this.fuelConsumed = fuelConsumed;
        this.milesDriven = milesDriven;
    }

    @Override
    double calculateFuelEfficiency() {
        return milesDriven/fuelConsumed;
    }
}