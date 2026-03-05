import java.io.*;
class pgm21{
    public static void main(String args[])
    {
        int a,b,c;
        DataInputStream din=new DataInputStream(System.in);
        try{
            System.out.println("enter two numbers:");
            String s=din.readLine();
            a=Integer.parseInt(s);
            s=din.readLine();
            b=Integer.parseInt(s);
            c=a/b;
            System.out.println("result="+c);
        }
        catch(IOException e1)
        {
            System.out.println("IO error:" +e1);
        }
        catch(ArithmeticException e2)
        {
            System.out.println("cannot divide by zero");
        }
        catch(NumberFormatException e3)
        {
            System.out.println("NFE:" +e3);
        }
    }
}