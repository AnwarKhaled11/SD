package javaapplication2;
public class TV 
{
    int chanal;
    int numchanal = 120;
    int volum = 7;
    int volumlevel;
    boolean on = true;

    public TV()
    {
    }
    public void turnOn () {
        if (on)
        {
            System.out.println("TV IS ON");
        }
    }
    public void turnOff ()
    {
        if (on=false)
            System.out.println("TV IS OFF");
    }
    public void setchanal(int newchanal)
    {
        newchanal = numchanal+1;
        System.out.println("New chanal is " + newchanal);
    }
    public void setVolum(int newvolum)
    {
        newvolum = volum+1;
        System.out.println("New Volum is " + newvolum);
    }
    public void chanalup ()
    {
        chanal++;
    }
    public void chanaldown ()
    {
        chanal--;
    }
    public void volumlup ()
    {
        volum++;
    }
    public void volumldown ()
    {
        volum--;
    }
}