import java.util.Scanner;

class pgm23 {
    public static void main(String args[]) {
        int a, b;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter two numbers:");
            a = sc.nextInt();
            b = sc.nextInt();

            try {
                int c = a / b;
                System.out.println("Result = " + c);
            }
            catch (ArithmeticException e) {
                System.out.println("Exception caught inside inner catch");
                throw e;   // re-throwing the exception
            }
            finally {
                System.out.println("Inner finally block executed");
            }
        }
        catch (ArithmeticException e) {
            System.out.println("Exception caught again after re-throw");
        }
        finally {
            System.out.println("Outer finally block executed");
        }
    }
}
