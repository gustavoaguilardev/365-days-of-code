package fundamentals.oop;

/**
 * Represents a simple Person entity
 */

public class Person {

    String name;
    int age;

    void introduce() {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
    }
}
