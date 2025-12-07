import java.io.*;
import java.util.*;

class Pgm4 {

    int n;
    int a[];

    public void search(int key) {
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                System.out.println("Value found at position " + (i + 1));
                return;
            }
        }
        System.out.println("Value not found");
    }

    public void sort() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        Pgm4 obj = new Pgm4();

        System.out.println("Enter limit:");
        obj.n = s.nextInt();

        obj.a = new int[obj.n];
        System.out.println("Enter the array:");
        for (int i = 0; i < obj.n; i++) {
            obj.a[i] = s.nextInt();
        }

        int choice;
        do {
            System.out.println(" MENU");
            System.out.println("1. Search");
            System.out.println("2. Sort");
            System.out.println("3. Display Array");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to search: ");
                    int key = s.nextInt();
                    obj.search(key);
                    break;

                case 2:
                    obj.sort();
                    break;

                case 3:
                    System.out.println("Array elements:");
                    for (int i = 0; i < obj.n; i++)
                        System.out.print(obj.a[i] + " ");
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);
    }
}
