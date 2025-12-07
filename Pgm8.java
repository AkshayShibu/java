import java.io.*;
import java.util.*;
class Pgm8{
    public int rev(int a)
    {
        int t=a;
        int r=0;
        while(t>0)
        {
            int d=t%10;
            r= r*10+d;
            t=t/10;
        }
        System.out.println("reverse:"+r);
        return r;
    }

    public void check(int n)
    {
        int p=rev(n);
        if(p==n)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }

    }

    public static void main(String args[])
    {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value");
        n=s.nextInt();
        Pgm8 obj=new Pgm8();
        obj.check(n);
    }
}