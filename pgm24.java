import java.util.Scanner;

class UDE extends Exception {
    String strError;

    public UDE() {
        strError = "Unknown Error";
    }

    public UDE(String s) {
        strError = s;
    }

    public String showError() {
        return strError;
    }
}

class pgm24 {
    public static void main(String args[]) {

        String s1;
        boolean alphaNum = false;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter password:");
        s1 = s.nextLine();

        try {
            if (s1.length() < 8) {
                throw new UDE("Less than 8 characters");
            }

            for (int i = 0; i < s1.length(); i++) {
                if (Character.isLetterOrDigit(s1.charAt(i))) {
                    alphaNum = true;
                    break;
                }
            }
            if (!alphaNum) {
                throw new UDE("Does not contain alphanumeric character");
            }

            if (!s1.matches(".*[@*!{}()\\[\\]=].*")) {
                throw new UDE("Does NOT contain any special character");
            }

            if (!s1.matches(".*[A-Z].*")) {
                throw new UDE("Does NOT contain any upper case character");
            }

            if (!s1.matches(".*[a-z].*")) {
                throw new UDE("Does NOT contain any lower case character");
            }

            for (int i = 0; i < s1.length() - 1; i++) {
                if (s1.charAt(i) == s1.charAt(i + 1)) {
                    throw new UDE("There is repetition of characters");
                }
            }

            System.out.println("Password is valid");

        } catch (UDE e) {
            System.out.println("Password Error: " + e.showError());
        }
    }
}
