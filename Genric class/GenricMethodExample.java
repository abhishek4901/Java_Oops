
class Box<T> {
    public <T>void display(T[] val){
        for (T el: val) {//T is datatype given by user
            System.out.println(el+" ");
        }
System.out.println();
    }
}
public class GenricMethodExample {
    public static void main(String[] args) {
        Box ex = new Box<>();
        Integer[] intArray = {1, 2, 3, 4, 5};
        ex.display(intArray); // Displaying Integer array

    }

}
