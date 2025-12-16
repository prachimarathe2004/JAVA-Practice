public class Student {
    private String name;

    public String getName() {   // getter
        return name;
    }

    public void setName(String name) {  // setter
        this.name = name;
    }

    // The main method is now part of the Student class
    public static void main(String[] args) {
        // Create an object (instance) of the Student class
        Student s = new Student();

        // Use the setter method to set the name
        s.setName("Alice");

        // Use the getter method to retrieve and print the name
        System.out.println("Student Name: " + s.getName());
    }
}
