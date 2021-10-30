package assig2_sec2;
import java.util.Date;
public class MyDate extends Employee
{
    Date year,month,day;

    public MyDate(Date year,Date month,Date day) 
    {
    this.day=day;
    this.month=month;
    this.year=year;
    }

    MyDate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "MyDate{" + "year=" + year + ", month=" + month + ", day=" + day + '}';
    }

    
    
    
}
