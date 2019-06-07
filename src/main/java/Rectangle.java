public class Rectangle extends Shape{
    double width;
        double length;

    Rectangle(){
        width=1;
        length=1;
    }
    Rectangle(double width, double length){
        this.width=width;
        this.length=length;
    }

    Rectangle(double width, double length, String color, boolean filled){
        super(color,filled);
        this.width=width;
        this.length=length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", Which is a subclass "+super.toString()+
                '}';
    }
}
