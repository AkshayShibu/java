import java.util.*;

class Employee {
    int eno;
    String ename;
    float esal;

    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee number: ");
        eno = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter employee name: ");
        ename = sc.nextLine();
        System.out.print("Enter employee salary: ");
        esal = sc.nextFloat();
    }

    public void display() {
        System.out.println("Employee No: " + eno);
        System.out.println("Employee Name: " + ename);
        System.out.println("Employee Salary: " + esal);
    }

    public boolean compare(int no) {
        return eno == no;
    }
}

public class Pgm18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        Employee e[] = new Employee[n];

        int choice;
        do {
            System.out.println("\n1. Enter employee details\n2. Display employee details\n3. Search employee by number\n4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    for (int i = 0; i < n; i++) {
                        e[i] = new Employee();
                        e[i].read();
                    }
                    break;

                case 2:
                    for (int i = 0; i < n; i++) {
                        if (e[i] != null)
                            e[i].display();
                    }
                    break;

                case 3:
                    System.out.print("Enter employee number to search: ");
                    int eno = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < n; i++) {
                        if (e[i] != null && e[i].compare(eno)) {
                            System.out.println("\nEmployee Found:");
                            e[i].display();
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Employee not found");
                    break;

                case 4: break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);
    }
}
