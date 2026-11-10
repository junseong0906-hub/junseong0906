class RectangleImpl implements IShape {
    private double width, height;
    public RectangleImpl(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() { return width * height; }
    @Override
    public double getPerimeter() { return 2 * (width + height); }
    public double getWidth() { return width; }
    public double getHeight() { return height; }
}

class TestRectangleImpl {
    public static void main(String[] args) {
        IShape r = new RectangleImpl(10., 20.);

        System.out.printf("area: %.2f\n", r.getArea());
        System.out.printf("perimeter: %.2f\n", r.getPerimeter());
    }
}

class Rectangle {
    protected double width;
    protected double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getWidth() { return width; }
    public double getHeight() { return height; }
}