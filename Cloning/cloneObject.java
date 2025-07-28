 class Data implements Cloneable {
    int a;
    int b;   
} 
public class cloneObject {
    public static void main(String[] args) {
     
            Data d1 = new Data();
            d1.a = 10;
            // ✅ Object cloning: d2 is a copy of d1
             Data d2 = d1;

            // Modify original and cloned objects separately
            d1.a = 50;
            d2.a = 60;
        System.out.println(d1.a); // prints 50
        System.out.println(d2.a);
    }}
 
