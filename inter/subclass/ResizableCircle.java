package javabai20.inter.subclass;

import javabai20.inter.supperclass.Resizable;

public class ResizableCircle extends Circle implements Resizable {
    public  ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return "ResizableCircle{" +
                "radius=" + radius +
                '}';
    }
    @Override
    public void resize(int percent) {
        System.out.println("Vch");
    }
}
