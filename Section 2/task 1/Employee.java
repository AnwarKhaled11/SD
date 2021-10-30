package assig2_sec2;
//import java.util.Date;
public class Employee extends Person
{
    private String office;
    private double salary;
    private MyDate date_hired;

    public void setOffice(String office) 
    {
        this.office = office;
    }

    public String getOffice() 
    {
        return office;
    }

    public void setSalary(double salary) 
    {
        this.salary = salary;
    }

    public double getSalary() 
    {
        return salary;
    }

    public void setDate_hired(MyDate date_hired)  
    {
        this.date_hired = date_hired;
    }

    public MyDate getDate_hired() 
    {
        return date_hired;
    }

    @Override
    public String toString() {
        return "Employee{" + "office=" + office + ", salary=" + salary + ", date_hired=" + date_hired + '}';
    }

    
    
    
    
}
