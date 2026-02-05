package fundamentals.oop;

/**
 * Day 014 - OOP Basics: Classes and Objects
 *
 * Objective:
 * - Create classes and objects
 * - Use attributes and methods
 */

public class Day014OopBasics {

    public static void main(String[] args) {

        Person person1 = new Person("Alice", 30);
        person1.introduce();

        Person person2 = new Person("Bob", 25);
        person2.introduce();
    }
}
