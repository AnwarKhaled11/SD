package assig_sec2_2;

public class Subject extends Student
{
    int Subject_ID,Subject_Hours;
    String Subject_Name;

//    public Subject(int Subject_ID,int Subject_Hours,String Subject_Name) 
//    {
//        this.Subject_ID=Subject_ID;
//        this.Subject_Hours=Subject_Hours;
//        this.Subject_Name=Subject_Name;
//    }
   public  void Student_Subject(String Subject_Name,int Subject_ID,int Subject_Hours) 
    {
        System.out.println("Name Subject is : " + Subject_Name+"Subject ID is : "+ Subject_ID+"Subject Hours is : "+Subject_Hours);
    } 
}
