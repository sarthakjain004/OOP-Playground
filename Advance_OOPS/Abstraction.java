import java.util.*;
abstract class Animal{
    public String name;
    Animal(String name){
        this.name = name;
    }
    abstract void makeSound();
}

class Dog extends Animal{
    Dog(String name){
        super(name);
    }
    void makeSound(){
        System.out.println("The dog " + name + " says : Woof!");
    }
}

class Cat extends Animal{
    Cat(String name){
        super(name);
    }
    void makeSound(){
        System.out.println("The cat " + name + " says : Meow!");
    }
}

class Abstraction{
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Whiskers");
        
        dog.makeSound();
        cat.makeSound();
    }
}