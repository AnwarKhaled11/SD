package sec3_assig3_1;
public class Ball implements Tossable
{
    private String barandName ;
    @Override
    public void toss() 
    {
        
    }

    public Ball(String barandName) 
    {
        this.barandName = barandName;
    }

    public void setBarandName(String barandName) 
    {
        this.barandName = barandName;
    }

    public String getBarandName() 
    {
        return barandName;
    }
    public void bounce(){}
    
}