package Shapes;

 abstract class Quadrilateral extends Shape implements Measurable {

     protected int length;
     protected int width;

     public Quadrilateral(int length, int width) {
         this.length = length;
         this.width = width;
     }

     public abstract void setLength(int length);

     public abstract void setWidth(int width);


 }
