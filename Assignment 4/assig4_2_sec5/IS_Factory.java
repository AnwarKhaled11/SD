package assig4_2_sec5;
public class IS_Factory extends Abstract_Factory
{
    Staff Get_Staff(String Job_Title) 
    {
        if (Job_Title.equalsIgnoreCase("Doctor"))
        {
            return new Doctor_IS();
        }
        else if (Job_Title.equalsIgnoreCase("Teaching Assistant"))
        {
            return new Teaching_Assistant_IS();
        }
        return null;
    }   
}
