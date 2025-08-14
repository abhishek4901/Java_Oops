class AgeException extends Exception {
 
    public AgeException(String message) {
         super(message);
    } 
}  
  
class Test {

    void checkEligibility(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age is less than 18");
        } else {
            System.out.println("You are eligible to code.");
        }
    }
}

class AgeExceptionExample {
    public static void main(String[] args) {
        Test test = new Test();
        try {
            test.checkEligibility(165); // Example: Passing age less than 18 and pass above 18 then no exception
        } catch (AgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
