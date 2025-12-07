import java.io.*;
import java.util.*;
class Pgm7{
	public int comp(int a,int b)
	{
		int t=(a>b)?a:b;
		return t;
	}

	public static void main(String args[]){
		System.out.println("Enter 3 numbers");
		int a,b,c;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		System.out.println("largest of "+a+"&"+b);
		Pgm7 obj=new Pgm7();
		int n=obj.comp(a,b);
		System.out.println(n);
		System.out.println("largest of 3 numbers");
		int x=obj.comp(n,c);
		System.out.println("Largest is "+x);

	}
}