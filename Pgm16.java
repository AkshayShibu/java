import java.util.*;

// Parent class
class Parent {

    final public void display() {   // final method
        System.out.println("This is Parent display method");
    }
}

// Child class
class Child extends Parent {

    // This method CANNOT override Parent's display()
    // If we try to override, compiler error will occur

    public void show() {
        System.out.println("This is Child show method");
    }
}

// Main class
public class Pgm16 {
    public static void main(String[] args) {

        Child c = new Child();
        c.display();  // Parent method
        c.show();     // Child method
    }
}
