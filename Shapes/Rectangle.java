package Shapes;

 class Rectangle extends Quadrilateral implements Measurable {
//    protected float length; // protected means this property cannot be accessed except for a subclass
//    protected float width; // protected means this property cannot be accessed except for a subclass
//
//    public Rectangle(float length, float width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public float getPerimeter() {
//        return ((2 * width) + (2 * length));
//    }
//    public float getArea() {
//        return length * width;
//    }


  @Override
  public double getPerimeter() {
   return 0;
  }

  @Override
  public double getArea() {
   return 0;
  }

  public Rectangle(int length, int width) {
   super(length, width);
  }

  @Override
  public void setLength(int length) {
   length = length;
  }

  @Override
  public void setWidth(int width) {
   width = width;
  }
 }
