public class Main {

    public static void main(String[] args) {

        Driver driver1 = new Driver("John Smith", "123");
        Driver driver2 = new Driver("Anna Brown", "456");

        Car car = new Car("Toyota", 2020, 4, "Petrol");
        Motorcycle motorcycle = new Motorcycle("Honda", 2018, false);
        Truck truck = new Truck("Volvo", 2015, 12.5, 4);

        car.setDriver(driver1);
        motorcycle.setDriver(driver1);
        truck.setDriver(driver2);

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = car;
        vehicles[1] = motorcycle;
        vehicles[2] = truck;

        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].startEngine();
            vehicles[i].displayInfo();

            if (vehicles[i].getDriver() != null) {
                vehicles[i].getDriver().displayDriverInfo();
            }
            else {
                System.out.println("No driver assigned.");
            }

            vehicles[i].stopEngine();
            System.out.println(" ");
        }
    }
}
