import java.io.*;
class Pgm11{
    public static void main(String args[])
    {
        int n;
        int s=0;
        int t=0;
        int i=1;
        DataInputStream d;
        d=new DataInputStream(System.in);
        try{
            System.out.println("Enter the limit:");
            n=Integer.parseInt(d.readLine());
            while(i<=n)
            {
                t=t+i;
                s=s+t;
                i++;
            }
            System.out.println("Sum="+s);
        }catch(Exception e){
            System.out.println("Error:"+e);
        }
    }
}