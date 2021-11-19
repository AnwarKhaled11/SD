package assig4_2_sec5;
public class CS_Factory extends Abstract_Factory
{
     Staff Get_Staff(String Job_Title) 
    {
        if (Job_Title.equalsIgnoreCase("Doctor"))
        {
            return new Doctor_CS();
        }
        else if (Job_Title.equalsIgnoreCase("Teaching Assistant"))
        {
            return new Teaching_Assistant_CS();
        }
        return null;
    }
}
