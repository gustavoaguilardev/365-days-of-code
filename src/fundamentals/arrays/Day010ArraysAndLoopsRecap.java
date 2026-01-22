package fundamentals.arrays;

/**
 * Day 010 - Arrays and Loops Recap
 *
 * Objective:
 * - Combine arrays, loops and conditionals
 * - Practice basic data processing logic
 */

public class Day010ArraysAndLoopsRecap {

    public static void main(String[] args) {

        int[] numbers = {3, 7, 2, 9, 4, 6};

        int sum = 0;
        int max = numbers[0];

        for (int number : numbers) {
            sum += number;

            if (number > max) {
                max = number;
            }
        }

        System.out.println("Sum of numbers: " + sum);
        System.out.println("Max number: " + max);
    }
}
