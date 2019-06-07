public class CircleTest {
    public static void main(String[] args) {
        Circle circle= new Circle();
        System.out.println(circle);
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());

        circle= new Circle(5);
        System.out.println(circle);
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());

        circle= new Circle(5, "yellow",false);
        System.out.println(circle);
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
    }
}
