//Single Inheritance


//Super class
class Vehicle {
    Vehicle() {
        System.out.println("This is a Vehicle");
    }
}

// Subclass 
class Car extends Vehicle {
    Car() {
        System.out.println("This Vehicle is Car");
    }
}

public class single {
    public static void main(String[] args) {
        // Creating object of subclass invokes base class constructor
        Car obj = new Car();
    }
}
