package javabai20.inter.subclass;

public class testGeoAndRes {
    public static void main(String[] args) {
        Circle c1 = new Circle(3.3);
        System.out.println(c1);
        ResizableCircle r1 = new ResizableCircle(3.2);
        System.out.println(r1);
        r1.resize(3);
    }
}
