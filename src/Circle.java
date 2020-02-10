public class Circle extends Shape {
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    private int radius;
    public Circle(String color, int radius){
        super(color);
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return 3.14*radius*radius;
    }

    @Override
    public double getPer() {
        return 2*3.14*radius;
    }

    @Override
    public void showAll() {
        System.out.println("圆的面积="+getArea());
        System.out.println("圆的周长="+getPer());
        System.out.println("圆的颜色是"+getColor());
    }
}
