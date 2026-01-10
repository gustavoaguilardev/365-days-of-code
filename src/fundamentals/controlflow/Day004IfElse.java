package fundamentals.controlflow;

/**
 * Day 004 - Control Flow: if / else
 *
 * Objective:
 * - Understand conditional logic using if, else if and else
 * - Write clear and readable conditional statements
 */

public class Day004IfElse {

    public static void main(String[] args) {

        int score = 78;

        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
    }
}
