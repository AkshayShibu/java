import java.io.*;
import java.util.*;
class Pgm6{

    public void add(int a[][] ,int b[][],int r,int c)
    {
        int i,j; 
        int sum[][] = new int[r][c];
        for( i=0;i<r;i++)
        {
            for( j=0;j<c;j++)
            {
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("Sum");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println("");
        }
    }

    public void mul(int a[][],int b[][],int r,int c)
    {
        int k,i,j;
        int m[][]=new int[r][c];
        for( i=0;i<r;i++){
            for( j=0;j<c;j++)
            {
                for(k=0;k<c;k++)
                {
                    m[i][j]+=a[i][k]*b[k][j];
                }
            }
        }

        System.out.println("Product");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(m[i][j]+" ");
            }
            System.out.println("");
        }

    }

    public static void main(String args[])
    {
        int i,j,r,c;
        Scanner s;
        s= new Scanner(System.in);
        System.out.println("Enter the row and col value ");
        r=s.nextInt();
        c=s.nextInt();
        int a[][]=new int[r][c];
        int b[][]=new int[r][c];
        System.out.println("Enter first matrix values");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("Enter second matrix values");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                b[i][j]=s.nextInt();
            }
        }

        System.out.println(" first matrix values");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        
        System.out.println(" 2nd  matrix values");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

        Pgm6 obj = new Pgm6();
        int x;
        do{
            System.out.println("1.add");
            System.out.println("2.mul");
            System.out.println("3.exit");
            System.out.print("Enter your choice:");
            x=s.nextInt();
            switch(x)
            {
                case 1: obj.add(a,b,r,c);
                        break;
                case 2: obj.mul(a,b,r,c);
                        break;
                case 3: break;        
                default: System.out.println("Invalid!!!");
            }   
        }while(x!=3);
    }
}