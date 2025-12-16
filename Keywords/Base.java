//program for Super Keyword 

class Super {
    int a = 10; // Instance variable
    static int b = 20; // Static variable
}

class Base extends Super { // Corrected: extends Super, not Parent
    void rr() {
        // Referring to parent instance variable
        System.out.println(super.a);

        // Referring to parent static variable 
        // Use Super.b for best practice
        System.out.println(Super.b); 
    }

    public static void main(String[] args) {
        // Cannot use 'super' here because main is static
        new Base().rr();
    }
}
