package creational.design.pattern;

//Abstract Product 1: Car
interface Car {
 void assemble();
}

//Abstract Product 2: Bike
interface Bike {
 void assemble();
}

//Concrete Product: Luxury Car
class LuxuryCar implements Car {
 @Override
 public void assemble() {
     System.out.println("Assembling a luxury car.");
 }
}

//Concrete Product: Regular Car
class RegularCar implements Car {
 @Override
 public void assemble() {
     System.out.println("Assembling a regular car.");
 }
}

//Concrete Product: Luxury Bike
class LuxuryBike implements Bike {
 @Override
 public void assemble() {
     System.out.println("Assembling a luxury bike.");
 }
}

//Concrete Product: Regular Bike
class RegularBike implements Bike {
 @Override
 public void assemble() {
     System.out.println("Assembling a regular bike.");
 }
}

//Abstract Factory: VehicleFactory
interface VehicleFactory {
 Car createCar();
 Bike createBike();
}

//Concrete Factory: Luxury Vehicle Factory
class LuxuryVehicleFactory implements VehicleFactory {
 @Override
 public Car createCar() {
     return new LuxuryCar();
 }

 @Override
 public Bike createBike() {
     return new LuxuryBike();
 }
}

//Concrete Factory: Regular Vehicle Factory
class RegularVehicleFactory implements VehicleFactory {
 @Override
 public Car createCar() {
     return new RegularCar();
 }

 @Override
 public Bike createBike() {
     return new RegularBike();
 }
}

//Client Code
public class AbstractFactoryExample {
 public static void main(String[] args) {
     // Create a luxury vehicle factory
     VehicleFactory luxuryFactory = new LuxuryVehicleFactory();
     Car luxuryCar = luxuryFactory.createCar();
     Bike luxuryBike = luxuryFactory.createBike();
     
     // Assemble luxury vehicles
     luxuryCar.assemble();  // Output: Assembling a luxury car.
     luxuryBike.assemble(); // Output: Assembling a luxury bike.

     // Create a regular vehicle factory
     VehicleFactory regularFactory = new RegularVehicleFactory();
     Car regularCar = regularFactory.createCar();
     Bike regularBike = regularFactory.createBike();

     // Assemble regular vehicles
     regularCar.assemble();  // Output: Assembling a regular car.
     regularBike.assemble(); // Output: Assembling a regular bike.
 }
}
