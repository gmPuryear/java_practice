package Shapes;

public class Square extends Rectangle {

    public Square(float side) {
        super(side, side); // calling the constructor in the superclass (Rectangle)
    }

    @Override
    public float getPerimeter() {
        float side = 0;
        return 4 * side;
    }
    @Override
    public float getArea() {
        return side ^ 2
    }

}
