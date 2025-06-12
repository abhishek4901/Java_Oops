class A implements Runnable {
    public void run() {
        for (int i = 1; i < 2; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() );
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i < 3; i++) {
            System.out.println("Thread " + this.getName() );
        }
    }
}

public class ThreadsAndRunnable {
    public static void main(String[] args) {
        A a1 = new A();

        Thread t1 = new Thread(a1);
        t1.setName("Runnable:1");

        Thread t2 = new Thread(a1);
        t2.setName("Runnable:2");

        B b1 = new B();
        b1.setName("ThreadClass:1");

        B b2 = new B();
        b2.setName("ThreadClass:2");

        // Start all threads
        t1.start();
        t2.start();
        b1.start();
        b2.start();
    }
}
