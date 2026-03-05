class A implements Runnable {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread : " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class pgm26 {
    public static void main(String args[]) {

        A r = new A();
        Thread t = new Thread(r);   // passing Runnable object
        t.start();                  // starting the thread

        for (int i = 1; i <= 5; i++) {
            System.out.println("Parent Thread : " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
