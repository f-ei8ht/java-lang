package instancevariableandinstancemethods;

public class Instance {

    int noOfWheel;
    float currentFuel;
    String color;
    float maxSpeed;
    int noOfSeats; // instance variables or properties

    public void drive() {
        System.out.println("Car is driving");
        currentFuel--;
    }

    public void addFuel(float fuel) {
        currentFuel += fuel;
    }

    public float getCurrentFuelLevel() {
        return currentFuel;
    }

    public static void main(String[] args) {
        Instance obj = new Instance();
        obj.currentFuel = 102.5f;
        obj.drive();
        obj.drive();
        obj.addFuel(1.3f);
        float result = obj.getCurrentFuelLevel();
        System.out.println(result);
    }
}