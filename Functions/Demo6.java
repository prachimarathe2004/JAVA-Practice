//Static vs Non-Static



public class Demo6 {

    public static void main(String[] args) {
        Demo6 obj = new Demo6();  
        obj.sayHello();           // non-static method call

        printMessage();           // static method call
    }

    public void sayHello() {      // NON-static
        System.out.println("Hello from non-static method");
    }

    public static void printMessage() { // STATIC
        System.out.println("Hello from static method");
    }
}
