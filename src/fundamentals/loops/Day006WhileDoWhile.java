package fundamentals.loops;

/**
 * Day 006 - Loops: while and do-while
 *
 * Objective:
 * - Understand how while and do-while loops work
 * - Learn the difference between pre-condition and post-condition loops
 */

public class Day006WhileDoWhile {

    public static void main(String[] args) {

        int counter = 1;

        // while loop (pre-condition)
        while (counter <= 5) {
            System.out.println("While loop count: " + counter);
            counter++;
        }

        System.out.println("-----");

        int number = 1;

        // do-while loop (post-condition)
        do {
            System.out.println("Do-while loop count: " + number);
            number++;
        } while (number <= 5);
    }
}
