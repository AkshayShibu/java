import java.util.Scanner;

class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}

class pgm22 {
    public static void main(String args[]) {
        int age;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter age:");
            age = sc.nextInt();

            if (age < 18) {
                throw new MyException("Age must be 18 or above");
            }

            System.out.println("Eligible");
        }
        catch (MyException e) {
            System.out.println("UDE: " + e.getMessage());
        }
    }
}
