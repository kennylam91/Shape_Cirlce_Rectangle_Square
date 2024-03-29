import java.util.Arrays;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[5];
        circles[0] = new Circle();
        circles[1] = new Circle(3);
        circles[2] = new Circle(5);
        circles[3] = new Circle(7);
        circles[4] = new Circle(4);
        System.out.println("Pre-sorted");
        for (Circle circle : circles) {
            System.out.println(circle);

        }
        CircleComparator circleComparator = new CircleComparator();

        Arrays.sort(circles, circleComparator);
        System.out.println("After-sorted");
        for (Circle circle : circles) {
            System.out.println(circle);

        }
    }
}
