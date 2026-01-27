package fundamentals.arrays;

/**
 * Day 012 - Arrays and Methods
 *
 * Objective:
 * - Learn how to create methods
 * - Pass arrays as parameters
 * - Return values from methods
 */
public class Day012ArraysAndMethods {

    public static void main(String[] args) {

        int[] numbers = {4, 8, 2, 9, 5};

        int sum = calculateSum(numbers);
        int max = findMax(numbers);

        System.out.println("Sum: " + sum);
        System.out.println("Max: " + max);
    }

    // Method to calculate sum of array elements
    private static int calculateSum(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

    // Method to find maximum value in array
    private static int findMax(int[] numbers) {
        int max = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        return max;
    }
}
