package assig5_sec6;
import java.math.BigDecimal;
/****
 @author ANWAR KHALED
****/
public class Multiplier implements MultiplayInterface
{
    @Override
    public BigDecimal Multiply(String Type ,BigDecimal X) 
    {
        BigDecimal Num1 = new BigDecimal(10.4);
        BigDecimal Num2 = Num1.multiply(Num1);
        System.out.println("Multiply Of " + Num1 + "  And  " + Num1 + " IS " + Num2);
        return Num2;    
    }
}