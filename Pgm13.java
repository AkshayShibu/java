import java.util.*;

class CString {
    private String str;
    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = sc.nextLine();
    }

    public void display() {
        System.out.println(str);
    }

    public boolean compare(CString s) {
        return this.str.equals(s.str);
    }

    public CString concatenate(CString s) {
        CString result = new CString();
        result.str = this.str + s.str;
        return result;
    }
}

public class Pgm13 {
    public static void main(String[] args) {

        CString s1 = new CString();
        CString s2 = new CString();

        System.out.println("Enter first string:");
        s1.read();

        System.out.println("Enter second string:");
        s2.read();

        System.out.print("First string: ");
        s1.display();

        System.out.print("Second string: ");
        s2.display();

        System.out.println("Strings equal? " + s1.compare(s2));

        CString concat = s1.concatenate(s2);
        System.out.print("Concatenated string: ");
        concat.display();
    }
}
