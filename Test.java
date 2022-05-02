import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
class Test
{
    public static void main(String[] args) 
    {
        String url = "jdbc:mysql://localhost:3306/lvg";
        try(
              Connection con = DriverManager.getConnection(url,"root","root");
              PreparedStatement pst = con.prepareStatement("delete from employee where empid=?")
           ) 
        {
            pst.setInt(1,102); 
            int count = pst.executeUpdate();
            System.out.println(count+"Rows Deleted");
        }
        catch(Exception ex)
        {
             System.out.println(ex);
        } 
    }                                     
} 











/*class Employee
{
    private int empid;
    private String ename;
    private double salary;
    public Employee() { }
    public Employee(int empid,String ename,double salary)
    {
        this.empid = empid;  this.ename = ename;  this.salary = salary;
    }
    public String toString()
    {
       return "Empid = "+empid+"\nEname = "+ename+"\nSalary = "+salary;  
    }
    public boolean equals(Object obj)     
    {
        if(obj instanceof Employee)
        {
            Employee e = (Employee)obj;
            return empid == e.empid && salary == e.salary && ename.equals(e.ename);
        }
        return false;
    }
    public int hashCode()
    {
        return empid + (int)salary + ename.hashCode();
    }
}*/

 



 