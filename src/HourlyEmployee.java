public class HourlyEmployee extends ColaEmployee {
    private int hour;
    private int hoursalary;
    public HourlyEmployee(String name,int hour,int hoursalary,int month){
        super(name,month);
        this.hour=hour;
        this.hoursalary=hoursalary;
    }
    @Override
    public double getSalary(int month) {
        if(hour<=160){
            return hour*hoursalary;
        }else {
         return  160*hoursalary+1.5*(hour-160)*hoursalary;
        }
    }
}
