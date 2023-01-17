public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("--Shape--");
        Shape s1 = new Shape("blue",false);
        Shape s2 = new Shape("black",true);
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        System.out.println(s1.toString());
        System.out.println("--s2--");
        System.out.println(s2.getColor());
        System.out.println(s2.isFilled());
        System.out.println(s2.toString());

        System.out.println("--Circle--");
        Circle c1 = new Circle(6);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.toString());

        System.out.println("--Rectangle--");

        Rectangle r1 = new Rectangle(10,30);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        System.out.println(r1.toString());


        System.out.println("--square--");
        Square square_1 = new Square(11);

        System.out.println(square_1.toString());
        System.out.println(square_1.getArea());
        System.out.println(square_1.getPerimeter());




    }
}