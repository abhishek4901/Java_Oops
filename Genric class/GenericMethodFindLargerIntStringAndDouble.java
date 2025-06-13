class Box<T> {
    // Generic method to display elements of an array
    public <T> void display(T[] val) {
        for (T el : val) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    // Generic method to find the largest element
    public static <T extends Comparable<T>> T findLargest(T[] array) {
        T largest = array[0];
        for (T element : array) {
            if (element.compareTo(largest) > 0) {
                largest = element;
            }
        }
        return largest;
    }
}

public class GenericMethodFindLargerIntStringAndDouble {
    public static void main(String[] args) {
        Box<Integer> ex = new Box<>();

        Integer[] intArray = {1, 2, 3, 4, 5};
        ex.display(intArray); // Displaying Integer array
        System.out.println("Largest Integer: " + Box.findLargest(intArray));

        Double[] doubleArray = {10.5, 20.2, 5.8, 30.9};
        ex.display(doubleArray); // Displaying Double array
        System.out.println("Largest Double: " + Box.findLargest(doubleArray));

        String[] strArray = {"apple", "banana", "grape", "pear"};
        ex.display(strArray); // Displaying String array
        System.out.println("Largest String: " + Box.findLargest(strArray)); // Based on lexicographic order
    }
}
