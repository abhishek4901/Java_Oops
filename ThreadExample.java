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
class ThreadExample{
    public static void main(String[] args) {
       A a1 = new A();
       a1.start();
       B b1 = new B();
       b1.start();
            
    }
 }
//output comes sometime and comes sometime hello...there working 2 threads concurrent manner