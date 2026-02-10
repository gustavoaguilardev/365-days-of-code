package fundamentals.oop;

public class Day018Inheritance {

    public static void main(String[] args) {

        Animal genericAnimal = new Animal("Unknown");
        genericAnimal.makeSound();

        Dog dog = new Dog("Buddy");
        dog.makeSound();
    }
}
