class Counter {
    int count;

   synchronized  void increment() {
        count++;
    }
}

public class ThreadSSync {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    c.increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    c.increment();
                }
            }
        });
        // Thread t3 = new Thread(new Runnable() {
        //     @Override
        //     public void run() {
        //         for (int i = 0; i < 1000; i++) {
        //             c.increment();
        //         }
        //     }
        // });

        t1.start();
        t2.start(); // Assuming t2 is defined elsewhere
        t1.join(); // Wait for t1 to finish , t1 and t2 add; single join use then work same but use 2+ thread then comes distrubation
        t2.join(); // Wait for t1 to finish ,  t2 add;
        // t3.start();
    //    t3.join(); 

        System.out.println("counter: " + c.count);
    }
}