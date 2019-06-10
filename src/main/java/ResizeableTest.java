public class ResizeableTest {
    public static void main(String[] args) {
        Resizeable[] resizeables = new Resizeable[3];
        resizeables[0] = new Circle(3);
        resizeables[1] = new Rectangle(4, 6);
        resizeables[2] = new Square(10);
        System.out.println("Pre Resize");
        for (Resizeable resizeable :
                resizeables) {
            System.out.println(resizeable);

        }
        for (Resizeable resizeable :
                resizeables) {
            resizeable.resize(50);

        }
        System.out.println("After resize!");
        for (Resizeable resizeable :
                resizeables) {
            System.out.println(resizeable);

        }


    }
}
