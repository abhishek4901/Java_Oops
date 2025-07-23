import java.util.*;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Number of digits: 1");
        } else if (n > 0) {
            int digits = (int) Math.log10(n) + 1;
            System.out.println("Number of digits: " + digits);
        } 
        sc.close();
    }
}
