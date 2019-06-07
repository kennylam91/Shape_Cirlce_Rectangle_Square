public class Circle extends Shape {
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double radius;

    Circle(){
        radius= 1.0;
    }

    Circle(double radius){
        this.radius=radius;
    }

    Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius=radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", Which is a subclass of"+super.toString()+
                '}';
    }
}
