package assig5_sec6;
import java.math.BigDecimal;
/****
 @author ANWAR KHALED
****/
public class Divider implements Dividelnterface
{
    @Override
    public BigDecimal divide(String Type ,BigDecimal X) 
    {
        MultiplayInterface multiplayInterface;

        if (Type.equalsIgnoreCase("divide")) 
        {
          BigDecimal Num1 = new BigDecimal(10.4);
          BigDecimal Num2= Num1.divide(Num1);
          System.out.println("divide Of " + Num1 + "  And  " + Num1 + " IS " + Num2);
          return Num2;     
        }
        else if (Type.equalsIgnoreCase("multiply"))
        {
            multiplayInterface = new Multiplier();
        }
        return X.divide(X);
    }
}