package assig5_sec6;
import java.math.BigDecimal;
/****
 @author ANWAR KHALED
****/
public class DividerAdapter implements Dividelnterface
{
    MultiplayInterface multiplayInterface;    
        public DividerAdapter(String Type)
        {
         if (Type.equalsIgnoreCase("Multiply")) 
         {
           multiplayInterface = new Multiplier();
         }
        }
   @Override
    public BigDecimal divide(String Type ,BigDecimal X) 
    {
        if(Type.equalsIgnoreCase("Multiply"))
        {
            multiplayInterface.Multiply(Type, X);   
        }
        return X.multiply(X);
    }
}