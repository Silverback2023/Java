public class Circle {
    private double radius;

    public Circle(double r) {
        radius = r;
    }

    public Circle(double d, boolean isDiameter) {
        if (isDiameter) {
            radius = d / 2;
        } else {
            radius = d;
        }
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(7.0);
        Circle c2 = new Circle(14.0, true);
        System.out.println("Radius of Circle 1: " + c1.getRadius());
        System.out.println("Diameter of Circle 2: " + c2.getDiameter());
    }
}




