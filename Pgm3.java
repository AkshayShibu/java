import java.io.*;
class Pgm3{
    public static void main(String args[])
        {
            int a= 27;
            int n;
            int count=0;
            DataInputStream d;
            d=new DataInputStream(System.in);
           try{ do{
                System.out.println("Enter the number:");
                n=Integer.parseInt(d.readLine());
                count++;
            }while(n!=a);
            System.out.println("Correctly guessed in "+count+"attempts"); 
        }catch(Exception e){System.out.println("Error:"+e);}
        }
}