package fundamentals.variables;

/**
 * Day 002 - Data Types and Type Casting
 *
 * Objective:
 * - Understand primitive data types in Java
 * - Learn implicit and explicit type casting
 */

public class Day002DataTypes {

    public static void main(String[] args) {

        // Primitive data types
        byte smallNumber = 10;
        int normalNumber = smallNumber; // implicit casting (widening)

        double preciseValue = 99.99;
        int truncatedValue = (int) preciseValue; // explicit casting (narrowing)

        long largeNumber = 1_000_000L;
        float decimalNumber = 5.5f;

        System.out.println("Small number (byte): " + smallNumber);
        System.out.println("Normal number (int): " + normalNumber);
        System.out.println("Precise value (double): " + preciseValue);
        System.out.println("Truncated value (int): " + truncatedValue);
        System.out.println("Large number (long): " + largeNumber);
        System.out.println("Decimal number (float): " + decimalNumber);
    }
}
