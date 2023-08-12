package Shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);

        System.out.println("The area of box1 is : " + box1.getArea());
        System.out.println("The perimeter of box1 is: " + box1.getPerimeter());

        Rectangle box2 = new Square(5);
        System.out.println("The area of box2 is: " + box2.getArea());
        System.out.println("The perimeter of box2 is: " + box2.getPerimeter());

    }




}
