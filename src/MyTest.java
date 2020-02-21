import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MyTest {

    public static void main(String[] args) {
        /*Shape rectangle = new Rectangle("绿色",20,10);
        rectangle.showAll();
        Shape circle = new Circle("绿色",10);
        circle.showAll();*/
        /*SalariedEmployee salariedEmployee = new SalariedEmployee("固定员工",6000,20);
        System.out.println(salariedEmployee.getSalary(20));
        HourlyEmployee hourlyEmployee = new HourlyEmployee("小时员工",300,20,20);
        System.out.println(hourlyEmployee.getSalary(20));
        SalesEmployee salesEmployee = new SalesEmployee("销售员工",30000,0.5,20);
        System.out.println(salesEmployee.getSalary(20));*/

        String url="jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8";
        String username="root";
        String password="123456";
        Connection con = null;
        PreparedStatement ppsm = null;
        try {
            //加载驱动   连哪种数据库就要加载哪种驱动
            Class.forName("com.mysql.jdbc.Driver");
            //创建连接  通过DriverManger来实现
            con = DriverManager.getConnection(url,username,password);
            // 写sql语句
            ppsm = con.prepareStatement("insert into emp(empno,ename,deptno) values('9999','周董',30)");
            int i = ppsm.executeUpdate();
            System.out.println(i);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if (ppsm != null)
                    ppsm.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}