import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] comparableCircles = new ComparableCircle[3];
        comparableCircles[0]= new ComparableCircle(1);
        comparableCircles[1]= new ComparableCircle(2.5);
        comparableCircles[2]= new ComparableCircle(2);
        System.out.println("Pre-sorted");
        for (ComparableCircle comparableCircle :
                comparableCircles) {
            System.out.println(comparableCircle);
        }

        Arrays.sort(comparableCircles);
        for (ComparableCircle comparableCircle :
                comparableCircles) {
            System.out.println(comparableCircle);
        }

    }
}
