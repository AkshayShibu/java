import java.util.*;

// Base class
class Parent {
    public void display() {
        System.out.println("Display method of Parent class");
    }
}

// Derived class
class Child extends Parent {

    public void display() {
        super.display();   // calls parent class method
        System.out.println("Display method of Child class");
    }
}

// Main class
public class Pgm17_a {
    public static void main(String[] args) {

        Child c = new Child();
        c.display();
    }
}
