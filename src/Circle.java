/**
 * Created by alex on 23-Dec-16.
 */
public class Circle {
    public double x, y, r;  // The center and the radius of the circle

    // The constructor method.
    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
    public Circle(double r) { x = 0.0; y = 0.0; this.r = r; }
    public Circle(Circle c) { x = c.x; y = c.y; r = c.r; }
    public Circle() { x = 0.0; y = 0.0; r = 1.0; }

    public double circumference() {
        return 2 * 3.14159 * r;
    }

    public double area() {
        return 3.14159 * r * r;
    }

//    Circle c1 = new Circle(1.414, 1.0, .25);

    public static void main(String[] args) {
        Circle c = new Circle(.25);
        System.out.println(c.circumference());
        System.out.println(c.area());
    }


}

