public class Cylinder {
    private double height;
    private double radius;

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }

    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

    public double getSurfaceArea() {
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Cylinder c = new Cylinder(7.0, 3.0);
        System.out.println("Volume: " + c.getVolume());
        System.out.println("Surface Area: " + c.getSurfaceArea());
    }
}