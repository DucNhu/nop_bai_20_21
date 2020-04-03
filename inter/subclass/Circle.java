package javabai20.inter.subclass;

import javabai20.inter.supperclass.GeometricObject;

public class Circle implements GeometricObject {
    double radius = 1.0f;
//    Constructor

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return radius * 2.0 * Math.PI;
    }
}
