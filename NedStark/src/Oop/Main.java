package Oop;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        System.out.println(dog.makeSound());
        System.out.println(cat.makeSound());
        cat.move();
    }
}
