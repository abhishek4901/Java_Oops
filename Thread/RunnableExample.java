class A implements Runnable{
   public  void run() {
        for( int i = 1; i< 50; i++ ){
            
            System.out.println("hii");
        }        
    }
}
class B implements Runnable{
     public void run() {
        for( int i = 1; i< 50; i++ ){
            
            System.out.println("hello");
        }        
    }
}
public class RunnableExample {
    public static void main(String[] args) {
        A a1 = new A();
        Thread t1 = new Thread(a1);// because runnable do not have start() , in thread have start()
        t1.start();
        B b1 = new B();
        Thread t2 = new Thread(b1);
        t2.start();  
    }
}
