public class Square extends  Rectangle{

    public Square(){

    }
    public Square( double side){
        super(side , side);

    }

    public Square(double side, String color, boolean filled) {
        super(side, side,color, filled);
    }


    public void  setSide(double width){
         super.setWidth(width);

    }
    public  double getSide(){

        return  super.getWidth();
    }

    public String toString() {

        return  "A Square with side= "+getSide()+" which is a subclass of"+super.toString();
    }

}
