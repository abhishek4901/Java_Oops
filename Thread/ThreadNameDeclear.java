class A implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " one");
        }
    }
}

class B implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " two");
        }
    }
}

public class ThreadNameDeclear {
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();
        Thread t1 = new Thread(a1, "Thread one");
        Thread t2 = new Thread(b1, "Thread two");
        t1.start();
        t2.start();
    }
}