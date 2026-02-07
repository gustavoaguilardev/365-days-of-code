package fundamentals.oop;

public class Day017Immutability {

    public static void main(String[] args) {

        ImmutablePerson person = new ImmutablePerson("Charlie", 40);

        System.out.println(person.getName());
        System.out.println(person.getAge());
        
    }
}
