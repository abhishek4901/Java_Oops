public class FinallyExample {
    public static void main(String[] args) {
        int a = 10; 
        int b = 10;  
        try { 
            if (b == 0) { 
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            int c = a / b;
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error: " + e);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        }
        finally {
            System.out.println("Execution completed.");
        }
    }
}
