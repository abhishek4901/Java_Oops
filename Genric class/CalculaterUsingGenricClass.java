import java.util.Scanner;
class Cal<T extends Number> {
    private T value1;
    private T value2;

    public Cal(T value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public double add() {
        return value1.doubleValue() + value2.doubleValue();
    }

    public double subtract() {
        return value1.doubleValue() - value2.doubleValue();
    }

    public double multiply() {
        return value1.doubleValue() * value2.doubleValue();
    }

    public double divide() {
        try {
        if (value2.doubleValue() == 0) {
            System.out.println("Division by zero is not allowed.");
        }
    } catch (ArithmeticException e) {
        System.out.println(e.getMessage());
        
    }
        return value1.doubleValue() / value2.doubleValue();
    }
}

public class CalculaterUsingGenricClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        Cal<Double> calc = new Cal<>(num1, num2);

        System.out.println("Addition: " + calc.add());
        System.out.println("Subtraction: " + calc.subtract());
        System.out.println("Multiplication: " + calc.multiply());
        try {
            System.out.println("Division: " + calc.divide());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}


