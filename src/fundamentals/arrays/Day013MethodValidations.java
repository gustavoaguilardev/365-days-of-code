package fundamentals.arrays;

/**
 * Day 013 - Method Validations and Edge Cases
 *
 * Objective:
 * - Validate method inputs
 * - Handle null and empty arrays
 * - Write safer methods
 */

public class Day013MethodValidations {

    public static void main(String[] args) {

        int[] numbers = {7, 3, 9, 1};

        System.out.println("Sum: " + calculateSum(numbers));
        System.out.println("Max: " + findMax(numbers));

        System.out.println("Empty array test: " + calculateSum(new int[]{}));
        System.out.println("Null array test: " + calculateSum(null));
    }

    private static int calculateSum(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

    private static int findMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return Integer.MIN_VALUE;
        }

        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        return max;
    }
}
