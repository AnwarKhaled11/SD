package assig4_2_sec5;
public class Factor_Producer 
{
    public static Abstract_Factory Get_Factory(String Factory_Name)
    {
       if (Factory_Name.equalsIgnoreCase("IS"))
        {
            return new IS_Factory();
        }
        else if (Factory_Name.equalsIgnoreCase("CS"))
        {
            return new CS_Factory();
        }
       else if (Factory_Name.equalsIgnoreCase("IT"))
        {
            return new IT_Factory();
        }
        return null;
    }
}
