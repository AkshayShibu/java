import java.util.Scanner;

class BankAccount {
    int balance;

    BankAccount(int balance) {
        this.balance = balance;
    }

    void deposit(int amount) {
        int temp = balance;
        temp = temp + amount;
        balance = temp;
        System.out.println("Deposited: " + amount +
                " | Balance: " + balance);
    }

    void withdraw(int amount) {
        int temp = balance;
        temp = temp - amount;
        balance = temp;
        System.out.println("Withdrawn: " + amount +
                " | Balance: " + balance);
    }
}

class Deposit extends Thread {
    BankAccount acc;
    int amount;

    Deposit(BankAccount acc, int amount) {
        this.acc = acc;
        this.amount = amount;
    }

    public void run() {
        acc.deposit(amount);
    }
}

class Withdraw extends Thread {
    BankAccount acc;
    int amount;

    Withdraw(BankAccount acc, int amount) {
        this.acc = acc;
        this.amount = amount;
    }

    public void run() {
        acc.withdraw(amount);
    }
}

class Pgm33 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        int balance = sc.nextInt();

        BankAccount acc = new BankAccount(balance);

        System.out.print("Enter deposit amount: ");
        int dep = sc.nextInt();

        System.out.print("Enter withdrawal amount: ");
        int wit = sc.nextInt();

        Deposit d = new Deposit(acc, dep);
        Withdraw w = new Withdraw(acc, wit);

        d.start();
        w.start();
    }
}
