package fundamentals.arrays;

/**
 * Day 009 - Enhanced for loop (for-each)
 *
 * Objective:
 * - Learn how to iterate arrays using enhanced for loop
 * - Understand when to use for-each vs traditional for
 */

public class Day009EnhancedFor {

    public static void main(String[] args) {

        int[] numbers = {5, 10, 15, 20, 25};

        // Traditional for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Traditional for: " + numbers[i]);
        }

        System.out.println("-----");

        // Enhanced for loop (for-each)
        for (int number : numbers) {
            System.out.println("Enhanced for: " + number);
        }
    }
}
