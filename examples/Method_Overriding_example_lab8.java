package examples;

public class Method_Overriding_example_lab8 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();
        Cow cow = new Cow();
        cow.sound();
        Dog dog = new Dog();
        dog.sound();
        Cat cat = new Cat();
        cat.sound();
    }
}
class Animal {
    void sound()
    {
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    @Override
    void sound() {
        System.out.println("Cat Meows");
    }
}
class Cow extends Animal{
    @Override
    void sound() {
        System.out.println("Cow MOOOOOOO");
    }
}