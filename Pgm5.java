import java.io.*;
import java.util.*;

class ArrayPass {

    
    public void display(int x[]) {
        System.out.println("Displaying array (passed to method):");
        for(int i=0;i<x.length;i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println("\n");
    }

   
    public int[] squareArray(int y[]) {
        int temp[] = new int[y.length];
        for(int i=0;i<y.length;i++) {
            temp[i] = y[i] * y[i];
        }
        return temp;
    }

    int arr[];

    
    ArrayPass(int a[]) {
        arr = a; 
    }

    public void showConstructorArray() {
        System.out.println("Array passed to constructor:");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }
}

class Pgm5 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = s.nextInt();

        int a[] = new int[n];
        System.out.println("Enter the array values:");
        for(int i=0;i<n;i++) {
            a[i] = s.nextInt();
        }

        ArrayPass obj = new ArrayPass(a);

        obj.showConstructorArray();     
        obj.display(a);                 

        int result[] = obj.squareArray(a); 

        System.out.println("Array returned from method (squared):");
        for(int i=0;i<result.length;i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println("\n");
    }
}
