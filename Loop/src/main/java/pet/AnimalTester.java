package pet;

public class AnimalTester {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.name = "fido";
        System.out.println(dog.name);
        dog.eat();
    }
}
