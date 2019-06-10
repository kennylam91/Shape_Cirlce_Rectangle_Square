public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());

        square = new Square(5);
        System.out.println(square);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());

        square= new Square(10,"brown",true);
        System.out.println(square);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());

    }
}
