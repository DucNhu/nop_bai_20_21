package javabai20.inter.subclass;

import javabai20.inter.supperclass.Movable;

public class TestMovable {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(5,6,78,23);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
//
        Movable m2 = new MovableCircle(1,2,3,4,43);
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);
        //
        MovableRectangle mo1= new MovableRectangle(1,2,3,4,44,33);
        System.out.println(mo1);
    }

}
