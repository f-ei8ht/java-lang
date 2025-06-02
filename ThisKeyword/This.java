package ThisKeyword;

public class This {
    int noOfWheel;
    float currentFuel;
    String color;
    float maxSpeed;
    int noOfSeats; // instance variables or properties

    public This drive() {
        System.out.println("Car is driving");
        currentFuel--;
        return this;
    }

    public void addFuel(float fuel) {
        currentFuel += fuel;
    }

    public float getCurrentFuelLevel() {
        return currentFuel;
    }

    public static void main(String[] args) {
        This obj = new This();
        obj.currentFuel = 103.0f;
        This car = obj.drive().drive().drive(); // method chaining
        car.addFuel(1.2f);
        float result = car.getCurrentFuelLevel();
        System.out.println(result);
    }
}
