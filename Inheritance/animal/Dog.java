package Inheritance.animal;

public class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sleep();
        dog.bark();
    }
}
