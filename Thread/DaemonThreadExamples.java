
class dthread extends Thread{
    public void run (){ 
         for (int i = 0; i < 10; i++) {
        
        if(Thread.currentThread().isDaemon()){
            System.out.println(" daemon Thread");
        }
        else {
            System.out.println(" this is not daemon Thread");   
       }
     }
  }
}
public class DaemonThreadExamples {
    public static void main(String[] args) {
        dthread d1 = new dthread();
        dthread d2 = new dthread();
        dthread d3 = new dthread();
        dthread d4 = new dthread();
        d1.setDaemon(true);
        
        d1.start();
        d2.setDaemon(true);
        d2.start();//daemon thread have low priority then d2 is not excute  after  using d3 then 
        d3.start();

    }
    
}
 
