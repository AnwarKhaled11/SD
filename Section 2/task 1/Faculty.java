package assig2_sec2;

public class Faculty extends Employee
{
 private int office_houre,rank; 

    public void setOffice_houre(int office_houre) 
    {
        this.office_houre = office_houre;
    }

    public int getOffice_houre() 
    {
        return office_houre;
    }

    public void setRank(int rank) 
    {
        this.rank = rank;
    }

    public int getRank() 
    {
        return rank;
    }

    @Override
    public String toString() {
        return "Faculty{" + "office_houre=" + office_houre + ", rank=" + rank + '}';
    }

    
 
}
