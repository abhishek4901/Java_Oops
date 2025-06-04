 class example<T>{
    private T value;
      T getValue(){//getter method
        return value;
    }
    public void setvalue(T val){//setter method
        value = val;
    }

}


public class genricClassExample {
    public static void main(String[] args) {
      
        example<Integer> exInt = new example<>(); // example with Integer type
        exInt.setvalue(100);
        System.out.println(exInt.getValue()); // prints 100

        example<String> exStr = new example<>(); // example with String type
        exStr.setvalue("abhi");
        System.out.println(exStr.getValue()); // prints abhi
        
        // If you want to use both String and Integer, you can use a generic class with a Pair or similar structure.
        // For now, example<T> only supports one type parameter.
        // Here's an example using String:
        example<String> exStr2 = new example<>();
        exStr2.setvalue("another string");
        System.out.println(exStr2.getValue()); // prints another string
    }
    
}