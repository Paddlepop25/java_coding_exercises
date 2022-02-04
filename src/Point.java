public class Point {
    private int x;
    private int y;

    public Point(){}

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // getters + setters + helper methods
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public double distance() {
        return distance(0,0);
    }
    public double distance(int xB, int yB) {
        return Math.sqrt((getX()-xB) * (getX()-xB) + (getY()-yB) * (getY()-yB));
    }
    public double distance(Point localPoint) {
        // to avoid repetitive code, use overloaded methods which is call method from a method
        return distance(localPoint.x, localPoint.y);
    }
}
