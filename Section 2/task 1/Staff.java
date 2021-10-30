package assig2_sec2;
public class Staff extends Employee
{
    private String title;
    
    public Staff()
    {
        this.title=title;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle()
    {
        return title;
    }

    @Override
    public String toString() {
        return "Staff{" + "title=" + title + '}';
    }

    
    
    
    
}
