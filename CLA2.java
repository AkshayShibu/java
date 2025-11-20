//write a program using switch case 
//@ Akshay Shibu
// Roll no: 05
//17/11/2025

import java.io.*;

class CLA2 {
    public static void main(String args[]) {
        int op1, op2, op3;

        op1 = Integer.parseInt(args[0]);
        op2 = Integer.parseInt(args[1]);
        op3 = Integer.parseInt(args[2]);

        switch(op3) {
            case 0:
                System.out.println("Sum = " + (op1 + op2));
                break;
            case 1:
                System.out.println("Diff = " + (op1 - op2));
                break;
            case 2:
                System.out.println("Product = " + (op1 * op2));
                break;
            case 3:
                if (op2 == 0) {
                    System.out.println("Error: Division by zero");
                } else {
                    System.out.println("Quotient = " + (op1 / op2));
                }
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}

