public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(2, 4);
        shapes[2] = new Square(8);
        for (Shape shape :
                shapes) {
            if(shape instanceof Square){
                Square square=(Square)shape;
                square.howToColor();
            }
        }
    }
}
