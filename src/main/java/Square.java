public class Square extends Rectangle implements Resizeable,Colorable{
    Square(){
        super(1,1);
    }
    Square(double side){
        super(side,side);
    }
    Square(double side,String color, boolean filled){
        super(side, side, color,filled);
    }
    public double getSide(){
        return this.getLength();
    }
    public void setSide(double side){
        this.setLength(side);
        this.setWidth(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="+this.getWidth()+
                ",Which is a subclass of "+
                super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides!");
    }
}
