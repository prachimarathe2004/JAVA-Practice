//Function calling another function


public class Demo4 {

    public static void main(String[] args) {
        calculateArea(5);
    }

    public static void calculateArea(int radius) {
        double area = getArea(radius); // calling another method
        System.out.println("Area = " + area);
    }

    public static double getArea(int r) {
        return 3.14 * r * r;
    }
}
