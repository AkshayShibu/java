import java.util.Scanner;

class Square extends Thread {
    int n;

    Square(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("Square of " + n + " = " + (n * n));
    }
}

class Cube extends Thread {
    int n;

    Cube(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("Cube of " + n + " = " + (n * n * n));
    }
}

class pgm29 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        Square t1 = new Square(n);
        Cube t2 = new Cube(n);

        t1.start();
        t2.start();
    }
}
