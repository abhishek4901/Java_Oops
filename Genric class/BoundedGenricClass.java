 class Box <T extends Number >{// T is type of parameter
    private T value;
      T getValue(){//getter method
        return value;
    }
    public void setvalue(T value){//setter method
        this.value = value;
    }

}
    public class BoundedGenricClass {
        
    
    public static void main(String[] args) {

       Box<Integer> exInt = new Box<>(); // example with Integer type
        exInt.setvalue(100);
        System.out.println(exInt.getValue()); // prints 100
    }
    
}

