// Superclass
class Vehicle {
   String brand = "Generic Vehicle";

   void start() {
     System.out.println("Vehicle is starting...");
   }
}
// Subclass
class Car extends Vehicle {
  int wheels = 4;
  void display() {
    System.out.println("Brand: " + brand + ", Wheels: " + wheels);
  }
}
public class InheritanceDemo {
  public static void main(String[] args) {
    Car c = new Car();
    c.start(); // inherited from Vehicle
    c.display(); // defined in Car
  }
}