public class MyTest {

    public static void main(String[] args) {
        /*Shape rectangle = new Rectangle("绿色",20,10);
        rectangle.showAll();
        Shape circle = new Circle("绿色",10);
        circle.showAll();*/
        SalariedEmployee salariedEmployee = new SalariedEmployee("固定员工",6000,20);
        System.out.println(salariedEmployee.getSalary(20));
        HourlyEmployee hourlyEmployee = new HourlyEmployee("小时员工",300,20,20);
        System.out.println(hourlyEmployee.getSalary(20));
        SalesEmployee salesEmployee = new SalesEmployee("销售员工",30000,0.5,20);
        System.out.println(salesEmployee.getSalary(20));
    }

}