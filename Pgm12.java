import java.io.*;
class Pgm12{
    public static void main(String args[])
    {
        int n;
        double s=0.0;
        double t=1.0;
        int i;
        DataInputStream d;
        d=new DataInputStream(System.in);
        try{
            System.out.println("Enter the limit:");
            n=Integer.parseInt(d.readLine());
            for(i=1;i<=n;i++)
            {
                t=t*i;
                s=s+i/t;
            }
            System.out.println("Sum="+s);
        }catch(Exception e){
            System.out.println("Error:"+e);
        }
    }
}