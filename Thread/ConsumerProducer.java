
class Data {

    int value;
    boolean flag = false;

    synchronized void produce(int value) {
        while (flag) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        this.value = value;
        System.out.println("Produced ..... " + value);
        flag = true;
        notify();
    }

    synchronized void consume() {
        while (!flag) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("Consumed " + value);
        flag = false;
        notify();
    }
}

class Producer extends Thread {

    Data data;

    Producer(Data data) {
        this.data = data;
    }

    public void run() {
        for (int i = 1; i < 10; i++) {
            data.produce(i); // Pass the value to produce

        }
    }
}

class Consumer extends Thread {

    Data data;

    public Consumer(Data data) {
        this.data = data;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            data.consume();

        }
    }
}

public class ConsumerProducer {

    public static void main(String[] args) {
        Data data = new Data();
        Producer p1 = new Producer(data);
        Consumer c1 = new Consumer(data);

        p1.start();
        c1.start();
    }
}

