class MyThread extends Thread {

    MyThread(String name) {
        setName(name);
    }

    public void run() {
        System.out.println(
            "Thread Name: " + Thread.currentThread().getName() +
            " | Priority: " + Thread.currentThread().getPriority()
        );
    }
}

class Pgm34 {
    public static void main(String args[]) {

        MyThread t1 = new MyThread("Low Priority Thread");
        MyThread t2 = new MyThread("Normal Priority Thread");
        MyThread t3 = new MyThread("High Priority Thread");

        t1.setPriority(Thread.MIN_PRIORITY);    // 1
        t2.setPriority(Thread.NORM_PRIORITY);   // 5
        t3.setPriority(Thread.MAX_PRIORITY);    // 10

        t1.start();
        t2.start();
        t3.start();
    }
}
