public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this(radius);
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return (radius * radius) * Math.PI;
    }
}

class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(20,"Blue");
        circle.getArea();
        circle.getRadius();
    }
}
