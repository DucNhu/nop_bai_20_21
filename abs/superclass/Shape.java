package javabai20.abs.superclass;

abstract public class Shape {
    String color;
    boolean filled;

    public Shape() {
        this.color = "red";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract public double getArea();

    abstract public double getPerimeter();

    @Override
    public String toString() {
        return "Shape[ " + color + ", " + filled + "]";
    }

}
