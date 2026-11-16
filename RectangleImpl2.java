class RectangleImpl2 extends Rectangle implements IShape {
    public RectangleImpl2(double width, double height) { 
        super(width, height);
    }    
    @Override
    public double getArea() { return getWidth() * getHeight(); }
    @Override
    public double getPerimeter() { return 2*(getWidth() + getHeight()); }
}

class TestRectangleImpl2 {
    public static void main(String[] args) {
        IShape r = new RectangleImpl2(10., 20.);

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