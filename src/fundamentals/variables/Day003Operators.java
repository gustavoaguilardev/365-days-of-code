package fundamentals.variables;

/**
 * Day 003 - Operators and Expressions
 *
 * Objective:
 * - Practice arithmetic, relational and logical operators
 * - Understand how expressions are evaluated
 */

public class Day003Operators {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        // Arithmetic operators
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        // Relational operators
        boolean isGreater = a > b;
        boolean isEqual = a == b;

        // Logical operators
        boolean logicalAnd = (a > 5) && (b < 5);
        boolean logicalOr = (a < 5) || (b < 5);
        boolean logicalNot = !(a == b);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        System.out.println("Is a greater than b? " + isGreater);
        System.out.println("Is a equal to b? " + isEqual);

        System.out.println("Logical AND: " + logicalAnd);
        System.out.println("Logical OR: " + logicalOr);
        System.out.println("Logical NOT: " + logicalNot);
    }
}
