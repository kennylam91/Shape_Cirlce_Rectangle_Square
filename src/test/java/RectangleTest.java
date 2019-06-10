public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle= new Rectangle();
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        rectangle= new Rectangle(3,5);
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        rectangle= new Rectangle(4,2,"black",false);
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());


    }
}
