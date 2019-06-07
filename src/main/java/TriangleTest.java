public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle=new Triangle();
        System.out.println(triangle);

        triangle=new Triangle(1,5,4.5);
        System.out.println(triangle);
        System.out.println(triangle.getArea()+","+ triangle.getPerimeter());
    }
}
