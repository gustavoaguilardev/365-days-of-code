package fundamentals.arrays;

/**
 * Day 008 - Arrays
 *
 * Objective:
 * - Understand array declaration and initialization
 * - Access elements by index
 * - Iterate arrays using loops
 */

public class Day008Arrays {

    public static void main(String[] args) {

        // Declare and initialize array
        int[] numbers = {10, 20, 30, 40, 50};

        // Access elements by index
        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[numbers.length - 1]);

        System.out.println("-----");

        // Iterate using for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }
    }
}
