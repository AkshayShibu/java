import java.util.Scanner;

class Odd extends Thread {
    int n;

    Odd(int n) {
        this.n = n;
    }
    public void run() {
        System.out.println("Odd numbers:");
        for (int i = 1; i <= n; i += 2) {
            System.out.println(i);
        }
    }
}

class Even extends Thread {
    int n;
    Even(int n) {
        this.n = n;
    }
    public void run() {
        System.out.println("Even numbers:");
        for (int i = 2; i <= n; i += 2) {
            System.out.println(i);
        }
    }
}

class pgm27 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n = sc.nextInt();
        Odd t1 = new Odd(n);
        Even t2 = new Even(n);
        t1.start();
        t2.start();
    }
}
