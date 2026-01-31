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

        Person person1 = new Person();
        person1.name = "Alice";
        person1.age = 30;
        person1.introduce();

        Person person2 = new Person();
        person2.name = "Bob";
        person2.age = 25;
        person2.introduce();
    }
}
