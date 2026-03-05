import java.io.*;
import java.util.*;

// Interface
interface IShape {
    void draw();
    void mov();
}

// Circle class
class Circle implements IShape {

    public void draw() {
        System.out.println("Drawing Circle");
    }

    public void mov() {
        System.out.println("Moving Circle");
    }
}

// Rectangle class
class Rectangle implements IShape {

    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    public void mov() {
        System.out.println("Moving Rectangle");
    }
}

// Main class
class Pgm20 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        IShape s;   // interface reference

        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();

        if (ch == 1) {
            s = new Circle();      // runtime binding
        } 
        else if (ch == 2) {
            s = new Rectangle();   // runtime binding
        } 
        else {
            System.out.println("Invalid choice");
            return;
        }

        s.draw();
        s.mov();
    }
}
