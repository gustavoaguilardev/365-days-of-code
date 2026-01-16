package fundamentals.loops;

/**
 * Day 007 - For Loop
 *
 * Objective:
 * - Understand the structure of the for loop
 * - Use break and continue to control iteration
 */

public class Day007ForLoop {

    public static void main(String[] args) {

        // Basic for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("For loop count: " + i);
        }

        System.out.println("-----");

        // Using continue
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // skip number 3
            }
            System.out.println("Continue example: " + i);
        }

        System.out.println("-----");

        // Using break
        for (int i = 1; i <= 5; i++) {
            if (i == 4) {
                break; // stop the loop
            }
            System.out.println("Break example: " + i);
        }
    }
}
