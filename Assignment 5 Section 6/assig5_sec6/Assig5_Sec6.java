package assig5_sec6;
import java.math.BigDecimal;
/****
 @author ANWAR KHALED
****/
public class Assig5_Sec6 
{
    public static void main(String[] args) 
    {
        BigDecimal a = new BigDecimal(3);
        Divider d = new Divider();
        d.divide("divide", a);
        d.divide("multiply", a);       
    }    
}