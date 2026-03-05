class Printer {

    // synchronized method ensures only one thread prints at a time
    synchronized void printDocument(String document) {

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

class PrintJob extends Thread {

    Printer printer;
    String document;

    PrintJob(Printer printer, String document) {
        this.printer = printer;
        this.document = document;
    }

    public void run() {
        printer.printDocument(document);
    }
}

class Pgm31 {
    public static void main(String args[]) {

        Printer printer = new Printer();

        PrintJob t1 = new PrintJob(printer, "Document_A.pdf");
        PrintJob t2 = new PrintJob(printer, "Document_B.docx");
        PrintJob t3 = new PrintJob(printer, "Document_C.txt");

        t1.setName("User-1");
        t2.setName("User-2");
        t3.setName("User-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
