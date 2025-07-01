// Class Example to demonstrate constructors
class Example {
    String name; // Instance variable to store the name
    int roll;    // Instance variable to store the roll number

    // Default constructor (without parameters)    
    Example() {      
        name = "Abhishek"; // Assign default name   
        roll = 45;         // Assign default roll number  
    }

    // Parameterized constructor (with one parameter)
    Example(int r) {
        name = "gaurav"; // Assign default name for this constructor
        roll = r;        // Assign roll number passed as a parameter
    }

    // Method to display the values of name and roll
    void display() {
        System.out.println("Name:" + name + " roll:" + roll); // Print name and roll
    }
}

// Main class to test the Example class
public class Constructor {
    public static void main(String[] args) {
        Example e1 = new Example();       // Create an object using the default constructor
        Example e2 = new Example(102);    // Create an object using the parameterized constructor
        e1.display();                     // Call display method for the first object
        e2.display();                     // Call display method for the second object
    }
}
