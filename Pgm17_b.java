import java.util.*;

// Base class
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

// Derived class
class Student extends Person {
    int rollNo;

    Student(String name, int rollNo) {
        super(name);   // passing argument to base class constructor
        this.rollNo = rollNo;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

// Main class
public class Pgm17_b {
    public static void main(String[] args) {

        Student s = new Student("Akshay", 101);
        s.display();
    }
}
