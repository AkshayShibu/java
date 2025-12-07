import java.io.*;
import java.util.*;
class Pgm10{
    public void p(int n)
    {
        if(n<1)
        {
            return;
        }
        else{
            System.out.println(n);
             p(--n);
        }
    }

    public void p1(int n,int i)
    {
        if(i>n)
        {
            return;
        }
        else{
            System.out.println(i);
             p1(n,++i);
        }
    }


    public static void main(String args[])
    {
        int n,i=1;
        Scanner s;
        s=new Scanner(System.in);
        Pgm10 ob=new Pgm10();
        System.out.println("Enter limit");
        n=s.nextInt();
        System.out.println("Numbers in n-1 order");
        ob.p(n);
        System.out.println("NUmbers in 1-n order");
        ob.p1(n,i);
    }
}