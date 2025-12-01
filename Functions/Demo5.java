//Method Overloading


public class Demo5 {

    public static void main(String[] args) {
        System.out.println(add(10, 20));
        System.out.println(add(10.5, 20.3));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }
}
