package javabai20.inter.subclass;

import javabai20.inter.supperclass.Movable;

public class MovableRectangle implements Movable{
    MovablePoint topLeft, bottomRight;
//    Constructor

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        bottomRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
    }

    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
    @Override
    public void moveUp() {
        topLeft.y -= topLeft.ySpeed;
    }
    @Override
    public void moveDown() {
        bottomRight.y += bottomRight.ySpeed;
    }
    @Override
    public void moveLeft() {
        topLeft.x -= topLeft.xSpeed;
    }
    @Override
    public void moveRight() {
        bottomRight.x += bottomRight.xSpeed;
    }

}
