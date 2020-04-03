package javabai20.abs.subclass;

import javabai20.abs.superclass.Animal;

public class BigDog extends Dog {
    @Override
    public void greeting() {
        System.out.println("Meowwwwwwwwwwwwww");
    }
    @Override
    public void greeting(Dog another) {
        System.out.println("Meo!!!!!!!!!!!!!!!!!!!!!!!");
    }
}
