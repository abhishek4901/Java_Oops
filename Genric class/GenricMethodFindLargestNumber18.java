import java.util.Scanner;

public class GenricMethodFindLargestNumber18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        // Taking input from user
        System.out.print("Enter the numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Display the array
        System.out.print("Array elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Finding the largest number
        int largest = numbers[0];
        for (int i = 1; i < size; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Largest number is: " + largest);

        sc.close();
    }
}
