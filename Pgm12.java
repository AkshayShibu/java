import java.util.*;

class Complex {
    private int real;
    private int imag;
    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real part: ");
        real = sc.nextInt();
        System.out.print("Enter imaginary part: ");
        imag = sc.nextInt();
    }

    public void display() {
        if (imag >= 0)
            System.out.println(real + " + " + imag + "i");
        else
            System.out.println(real + " - " + (-imag) + "i");
    }

    public Complex add(Complex c) {
        Complex result = new Complex();
        result.real = this.real + c.real;
        result.imag = this.imag + c.imag;
        return result;
    }

    public Complex multiply(Complex c) {
        Complex result = new Complex();
        result.real = (this.real * c.real) - (this.imag * c.imag);
        result.imag = (this.real * c.imag) + (this.imag * c.real);
        return result;
    }
}

 class Pgm12{
    public static void main(String[] args) {

        Complex c1 = new Complex();
        Complex c2 = new Complex();

        System.out.println("Enter first complex number:");
        c1.read();

        System.out.println("Enter second complex number:");
        c2.read();

        Complex sum = c1.add(c2);
        Complex product = c1.multiply(c2);

        System.out.print("First number: ");
        c1.display();

        System.out.print("Second number: ");
        c2.display();

        System.out.print("Sum: ");
        sum.display();

        System.out.print("Product: ");
        product.display();
    }
}
