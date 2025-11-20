//write a program to print values as command line arguments
//@ Akshay Shibu
// Roll no: 05

import java.io.*;
class CLA{
	public static void main(String args[]) {
            if(args.length<2)
            {
                  System.out.println("arguments not present.\n usage: cla arg1 arg2 ");
                    return;
             }
             int a = Integer.parseInt(args[0]);
              int b = Integer.parseInt(args[1]);
              System.out.print("a="+a +" b="+b);
             }
     }

