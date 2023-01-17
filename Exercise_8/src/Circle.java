public class Circle extends  Shape {
   private double radius  ;

    public  Circle(){
        this.radius = 1.0;

    }

    public  Circle(double radius){
        this.radius = radius;
    }

    public Circle( double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {

        return radius;
    }

    public void setRadius(double radius) {

        this.radius = radius;
    }

    //A = πr²
    public double getArea(){
        double area = this.radius * this.radius *3.14;
        return   area;
    }

    //perimeter = 2 · π · r
    public double getPerimeter(){
        double perimeter = 2 * 3.14 * this.radius;
        return perimeter;
    }



    @Override
    public String toString() {

        return "A Circle with radius = "+radius+ " which is a subclass of "+ super.toString();
    }
}
