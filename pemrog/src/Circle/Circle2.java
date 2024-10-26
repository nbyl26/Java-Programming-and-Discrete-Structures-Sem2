package Circle;
public class Circle2 {
    private static int numberOfObject;
    private double radius;
    
    Circle circle = new Circle();

    public Circle2(){
        numberOfObject++;
    }

    public Circle2(double newRadius){
        if (newRadius >= 0)
            radius = newRadius;
        numberOfObject++;
    }

    public void setRadius(double newRadius){
        if (newRadius >= 0)
            radius = newRadius;
    }

    public static int getNumberOfObject(){
        return numberOfObject;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }
}
