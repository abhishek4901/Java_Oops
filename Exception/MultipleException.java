import java.util.Scanner; // Import Scanner for input

public class MultipleException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for input

        try { 
            // Prompt user for two integers
            System.out.print("Enter first integer: ");
            int a = Integer.parseInt(sc.nextLine());  
            System.out.print("Enter second integer: ");
            int b = Integer.parseInt(sc.nextLine()); 
          
            int result = a / b; // May throw ArithmeticException

            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Error: Cannot divide by zero.");
        } catch (NumberFormatException e) {
            // Handle invalid integer input
            System.out.println("Error: Please enter valid integers.");
        } catch (Exception e) {
            // Handle any other exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            sc.close(); // Close the scanner resource
            System.out.println("Program ended.");
        }
    }
}
