class A extends Thread{
    public  void run (){//default protect hota h 
        for( int i = 1; i< 50; i++ ){
            
            System.out.println("hii");
        }
    }
}
class B extends Thread{
     public void run (){
        for( int i = 1; i< 50; i++ ){
            
            System.out.println("hello");
        }
    }
}


public class ThreadPriority {
    public static void main(String[] args) {
        A a1 = new A();
        a1.start();
        B b1 = new B();
        b1.start();
        System.out.println(a1.getPriority());
    }
}
//output priority not decide by given priority method. is=t is working according cpu cycle(cpu time)
