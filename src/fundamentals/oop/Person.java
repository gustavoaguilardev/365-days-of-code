package fundamentals.oop;

/**
 * Represents a simple Person entity with encapsulation
 */

public class Person {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            return;
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            return;
        }
        this.age = age;
    }

    public void introduce() {
        System.out.println(
                "Hi, my name is " + name + " and I am " + age + " years old."
        );
    }
}
