package Circle;
public class testCircle{
    public static void main(String[] args){

        // CirclePackage circlePackage = new CirclePackage(10);
        // System.out.println(circlePackage.getArea());
        // circlePackage.print();

        // Circle circle1 = new Circle();
        // Circle circle2 = new Circle(25);
        // Circle circle3 = new Circle(125);

        // System.out.println(circle1.getPerimeter());
        // System.out.println(circle2.getArea());

        // Circle circle4;
        // circle4 = new Circle(30.5);
        // System.out.println(circle4.getPerimeter());
        // System.out.println(circle4.getArea());
        // System.out.println(circle4.radius);


        Circle2 circle_ = new Circle2();

        System.out.println(circle_.getArea());
        System.out.println(Circle2.getNumberOfObject());

        Circle2 circle_1 = new Circle2(10);
        System.out.println(circle_1.getArea());
        System.out.println(Circle2.getNumberOfObject());


        Circle2 circle_2 = new Circle2(-10);
        
        System.out.println(circle_2.getArea());
        System.out.println(Circle2.getNumberOfObject());
        circle_2.setRadius(100);        
        System.out.println(circle_2.getArea());
        
        
    }
}