package javabai20.abs.subclass;

import javabai20.abs.superclass.Animal;

public class Dog extends Animal {
    @Override
    public void greeting() {
        System.out.println("Meow!!!!");
    }
    public void greeting(Dog another) {
        System.out.println("Meowwwwwwwww");
    }

}
