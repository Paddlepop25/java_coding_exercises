public class AreaCalculator {

    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
    }

    public static double area(double radius) {
        double areaOfCircle = radius * radius * Math.PI;
        return radius < 0 ? -1 : areaOfCircle;
    }

    // overloaded method (same name, different parameters)
    public static double area (double x, double y) {
        double areaOfRectangle = x * y;
        return x < 0 || y < 0 ? -1 : areaOfRectangle;
    }
}
