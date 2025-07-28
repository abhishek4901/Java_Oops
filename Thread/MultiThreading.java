class A extends Thread {
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println("Hi");
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println("Hello");
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        A t1 = new A(); // Thread 1
        B t2 = new B(); // Thread 2

        t1.start(); // Start Thread 1
        t2.start(); // Start Thread 2
    }
}
