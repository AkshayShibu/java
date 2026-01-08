import java.util.*;

class Student {
    private int sno;
    private String sname;
    private String sprogram;

    public void read() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student number (sno): ");
        sno = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter student name (sname): ");
        sname = sc.nextLine();
        System.out.print("Enter student program (sprogram): ");
        sprogram = sc.nextLine();
    }

    public void display() {
        System.out.println("Student Number: " + sno);
        System.out.println("Student Name: " + sname);
        System.out.println("Student Program: " + sprogram);
    }

    public boolean compare(Student s) {
        return this.sno == s.sno &&
               this.sname.equals(s.sname) &&
               this.sprogram.equals(s.sprogram);
    }
}

public class Pgm14 {
    public static void main(String[] args) {

        Student st1 = new Student();
        Student st2 = new Student();

        System.out.println("Enter first student details:");
        st1.read();

        System.out.println("\nEnter second student details:");
        st2.read();

        System.out.println("\nFirst Student:");
        st1.display();

        System.out.println("\nSecond Student:");
        st2.display();

        System.out.println("\nAre both students equal? " + st1.compare(st2));
    }
}
