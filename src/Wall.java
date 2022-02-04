public class Wall {
    private double width;
    private double height;

    // constructor 1 - empty
    public Wall() {}

    // constructor 2 - with conditions
    public Wall(double width, double height) {
        this.width = width < 0 ? 0 : width;
        this.height = height < 0 ? 0 : height;
    }

    // methods - getters
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }

    // methods - setters
    public void setWidth(double num) {
        this.width = num < 0 ? 0 : num;
    }
    public void setHeight(double num) {
        this.height = num < 0 ? 0 : num;
    }

    // methods
    public double getArea() {
        return width * height;
    }
}
