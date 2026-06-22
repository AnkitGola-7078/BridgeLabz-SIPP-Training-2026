
public class Circle {
    double radius;

    static double areaOfCircle(double r){
        return 3.14*r*r;
    }

    void display(){
        System.out.println("Area of Circle: " +areaOfCircle(radius));
    }

    Circle(double r){
        this.radius=r;
    }
    public static void main(String[] args) {
        Circle c=new Circle(2.0);
        c.display();
    }
}
