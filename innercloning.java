class Data implements Cloneable{
    int a;
    int b;
    public Object clone() throws 
    CloneNotSupportedException{
        return super.clone();
    } 
}
public class innercloning {
    public static void main(String[] args) throws 
    CloneNotSupportedException{
        Data d1=new Data();
        d1.a=30;
        d1.b=40;
        Data d2=(Data)d1.clone();
    }
    
}
