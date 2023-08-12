package Shapes;

public class Rectangle {
    protected float length; // protected means this property cannot be accessed except for a subclass
    protected float width; // protected means this property cannot be accessed except for a subclass

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getPerimeter() {
        return ((2 * width) + (2 * length));
    }
    public float getArea() {
        return length * width;
    }

}
