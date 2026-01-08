import java.util.*;

// HASA class
class Address {
    String city;
    String state;

    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter city: ");
        city = sc.nextLine();
        System.out.print("Enter state: ");
        state = sc.nextLine();
    }

    public void display() {
        System.out.println("City: " + city);
        System.out.println("State: " + state);
    }
}

// Parent class (ISA)
class Person {
    String name;

    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
    }

    public void display() {
        System.out.println("Name: " + name);
    }
}

// Child class demonstrating ISA + HASA
class Student extends Person {
    int rollNo;
    Address addr;   // HASA relationship

    public void read() {
        Scanner sc = new Scanner(System.in);
        super.read();
        System.out.print("Enter roll number: ");
        rollNo = sc.nextInt();
        sc.nextLine();

        addr = new Address();
        addr.read();
    }

    public void display() {
        super.display();
        System.out.println("Roll No: " + rollNo);
        addr.display();
    }
}

// Main class
public class Pgm15 {
    public static void main(String[] args) {

        Student s = new Student();

        System.out.println("Enter student details:");
        s.read();

        System.out.println("\nStudent details:");
        s.display();
    }
}
    