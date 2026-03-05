// Interface
interface Shape {
    void draw();   // abstract method
}

// First implementation
class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Second implementation
class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Main class
public class pgm19 {
    public static void main(String[] args) {

        Shape s;    // Interface reference

        s = new Circle();      // object of Circle
        s.draw();              // calls Circle's draw()

        s = new Rectangle();   // object of Rectangle
        s.draw();              // calls Rectangle's draw()
    }
}
