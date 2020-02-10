public abstract class Shape {
    private String color;
    private double area;
    private double per;


    public Shape(){}
    public Shape(String color){
            this.color = color;
    }
    public String getColor(){
        return color;
    }
    public abstract double getArea();
    public abstract double getPer();
    public abstract void showAll();
    }

