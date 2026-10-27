class Rectangle {
    private double height;
    private double width;
    private double area;

    Rectangle(double h, double w) {
        height = h;
        width = w;
        area = w * h;
    }

    double getArea(){return area;}
    double getHeight(){return height;}

    void getHeight(double h){
        height = h;
        area = width * height;
    }

    double getWidth(){return width;}
    void setWidth(double w){
        width = w;
        area = width * height;
    }
}



public class TestRectangle {
    public static void main(String[] args) {

        Rectangle rect = new Rectangle(10, 15);
        double area = rect.getArea();
        System.out.println("area = " + area);
        rect.setWidth (20);
        area = rect.getArea();
        System.out.println("new area = " + area);


    }

}
