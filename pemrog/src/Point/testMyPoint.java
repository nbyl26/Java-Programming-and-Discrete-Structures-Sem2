package Point;

public class testMyPoint {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(10, 30.5);

        System.out.println("Distance between p1 and p2: " + p1.distance(p2));
    }
}
