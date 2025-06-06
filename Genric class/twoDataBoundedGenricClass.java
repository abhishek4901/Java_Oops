class Box<T extends Number, V extends String> { // T is bounded to Number, V can be any type (e.g., String)
    private T value1;
    public V value2;

    T getValue1() { // getter method for T
        return value1;
    }

    V getValue2() { // getter method for V
        return value2;
    }

    public void setValue(T value1, V value2) { // setter for T and V
        this.value1 = value1;
        this.value2 = value2;
    }

}

public class twoDataBoundedGenricClass {
    public static void main(String[] args) {
        Box<Integer, String> box = new Box<>(); // BoundedGenric  using Integer and String types
        box.setValue(42,"abhishek");
        
        System.out.println( box.getValue1()); // prints 42
        System.out.println(box.getValue2()); // prints abhishek
    }
}