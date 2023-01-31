public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getParameter() {
        return 2 * Math.PI * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(7.0);
        System.out.println("Area: " + c.getArea());
        System.out.println("Perimeter: " + c.getParameter());
    }
}