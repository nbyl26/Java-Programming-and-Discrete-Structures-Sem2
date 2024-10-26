package Circle;
public class Circle {
    double radius;

    Circle(){
        radius = 1;
    }
    Circle(double newRadius){
        radius = newRadius;
    }
    double getPerimeter(){
        double perimeter = Math.PI * radius;
        return perimeter;
    }
    double getArea(){
        return Math.PI * radius * radius;
    }
}
