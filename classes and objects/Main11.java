class Car {
    String brand;
    int speed;

    void drive() {
        System.out.println("Car is driving");
    }
}

public class Main11 {
    public static void main(String[] args) {
        Car c = new Car();  // object
        c.brand = "Honda";
        c.speed = 100;
        c.drive();
    }
}
