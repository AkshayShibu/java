import java.util.Scanner;

class BankAccount {
    int balance;

    BankAccount(int balance) {
        this.balance = balance;
    }

    // synchronized method to prevent race condition
    synchronized void withdraw(String user, int amount) {

        System.out.println(user + " is trying to withdraw " + amount);

        if (balance >= amount) {
            try {
                Thread.sleep(500);   // simulate ATM processing time
            } catch (Exception e) {}

            balance = balance - amount;
            System.out.println("");
            System.out.println(user + " withdrawal successful");
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println(user + " withdrawal failed (Insufficient balance)");
            System.out.println("Current balance: " + balance);
        }

        System.out.println("");
    }
}

class ATMUser extends Thread {
    BankAccount acc;
    int amount;
    String user;

    ATMUser(BankAccount acc, String user, int amount) {
        this.acc = acc;
        this.user = user;
        this.amount = amount;
    }

    public void run() {
        acc.withdraw(user, amount);
    }
}

class Bank {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial account balance: ");
        int balance = sc.nextInt();
        BankAccount acc = new BankAccount(balance);
        System.out.print("Enter withdrawal amount for User 1: ");
        int a1 = sc.nextInt();
        System.out.print("Enter withdrawal amount for User 2: ");
        int a2 = sc.nextInt();
        ATMUser u1 = new ATMUser(acc, "User1", a1);
        ATMUser u2 = new ATMUser(acc, "User2", a2);
        u1.start();
        u2.start();
    }
}
