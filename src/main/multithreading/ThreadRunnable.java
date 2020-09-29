package main.multithreading;

class javaThreadRunnableRunning {
    public static void main(String[] args) {

        ThreadRunnable threadRunnable = new ThreadRunnable("Florian");
        threadRunnable.starting();
        threadRunnable.sleep(1000);

        ThreadRunnable threadRunnable2 = new ThreadRunnable("Antoine");
        threadRunnable2.starting();

    }
}

public class ThreadRunnable implements Runnable {

    private Thread thr;
    private String name;

    public ThreadRunnable(String name) {
        this.name = name;
        System.out.println("Thread - " + name + " is being created");

    }

    @Override
    public void run() {
        System.out.println("Thread - " + name + " is being run");

        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread - " + name + " " + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException ex) {
            System.out.println("Thread - " + name + "is interrupted");
        }

        System.out.println("Thread - " + name + " is stopping");

    }

    public void starting() {
        System.out.println("Thread - " + this.name + " is starting");

        if (thr == null) {
            thr = new Thread(this, name);
            thr.start();
        }
    }

    public void sleep(int milliseconds) {
        if (thr != null) {
            try {
                System.out.println("Thread - " + this.name + " will sleep during " + milliseconds + "ms");
                Thread.sleep(milliseconds);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
