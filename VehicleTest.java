class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle constructor called");
    }

    void start() {
        System.out.println(brand + " vehicle is starting.");
    }
}

// Car class extends Vehicle
class Car extends Vehicle {
    int numDoors;

    Car(String brand, int numDoors) {
        super(brand); // Call Vehicle constructor
        this.numDoors = numDoors;
        System.out.println("Car constructor called");
    }

    @Override
    void start() {
        super.start(); // Call Vehicle's start()
        System.out.println("Car with " + numDoors + " doors is ready to go.");
    }
}

// ElectricCar extends Car
class ElectricCar extends Car {
    int batteryCapacity; // in kWh

    ElectricCar(String brand, int numDoors, int batteryCapacity) {
        super(brand, numDoors); // Call Car constructor
        this.batteryCapacity = batteryCapacity;
        System.out.println("ElectricCar constructor called");
    }

    @Override
    void start() {
        System.out.println(brand + " electric car is booting silently.");
        System.out.println("Battery capacity: " + batteryCapacity + " kWh.");
    }
}

// Test the hierarchy
public class VehicleTest {
    public static void main(String[] args) {
        System.out.println("Creating Vehicle:");
        Vehicle v = new Vehicle("GenericBrand");
        v.start();

        System.out.println("\nCreating Car:");
        Car c = new Car("Toyota", 4);
        c.start();

        System.out.println("\nCreating ElectricCar:");
        ElectricCar e = new ElectricCar("Tesla", 4, 100);
        e.start();
    }
}