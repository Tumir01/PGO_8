public class Main {
    public static void main(String[] args) {

        Vehicle Car1 = new Car("Audi", "A8", 2010,230000, 160);
        System.out.println("Efektywność paliwowa samochoda: "+ Car1.calculateFuelEfficiency());

        Vehicle Truck1 = new Truck("Volvo", "VNL", 2018, 520000, 550, 1000);
        System.out.println("Efektywność paliwowa ciezarowki: "+ Truck1.calculateFuelEfficiency());
    }
}