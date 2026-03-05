class Printer extends Thread {
    String document;
    Printer(String document) {
        this.document = document;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " started printing: " + document);
        try {
            Thread.sleep(500);   // simulate printing time
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(Thread.currentThread().getName() +
                " finished printing: " + document);
    }
}

class Pgm30 {
    public static void main(String args[]) {
        Printer p1 = new Printer("Document_A");
        Printer p2 = new Printer("Document_B");
        Printer p3 = new Printer("Document_C");
        p1.setName("User-1");
        p2.setName("User-2");
        p3.setName("User-3");
        p1.start();
        p2.start();
        p3.start();
    }
}
