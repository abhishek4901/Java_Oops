//shallow copy
class Data {
    int a;
    int b;
}

public class cloneObject {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.a = 10;
        d1.b = 20;
        /* deep copy 
        Data d3=new Data() ;
        d3.a=d1.a;
         
        */

        Data d2 = d1;  // d2 points to the same object as d1
        d1.a = 50;
        d2.a=60;     // modifying a via d1

        System.out.println(d1.a); // prints 50
        System.out.println(d2.a);
        System.out.println((d1.b));
        System.out.println((d2.b));
        // also prints 50, because d2 and d1 refer to the same object
    }
}
