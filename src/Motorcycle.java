public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, int year, boolean hasSidecar){
        super(brand, year);
        this.hasSidecar = hasSidecar;
    }

    public void startEngine(){
        System.out.println("Motorcycle engine started");
    }
    public void stopEngine() {
        System.out.println("Motorcycle engine stopped.");
    }
}
