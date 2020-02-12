public abstract class ColaEmployee {
    public ColaEmployee(String name, int month){
        this.name = name;
        this.month = month;
    }
    private String name;
    private int month;
    public abstract double getSalary(int month);
}
