package assig_sec2_2;

public class Student 
{
  String Student_Name;
  private int Student_ID;
  int Student_GPA;
  //Subject Math;
  //Address address1;
//  Subject Math = new Subject();
//  Address MyAddress = new Address();
//  
    public void setStudent_ID(int Student_ID) 
    {
        this.Student_ID = Student_ID;
    }

    public int getStudent_ID() 
    {
        return Student_ID;
    }
    public  void Student_Data(String Student_Name,int Student_GPA,int getStudent_ID) 
    {
        System.out.println("Name Student is : " + Student_Name+"Student ID is : "+ getStudent_ID+"Student GPA is : "+Student_GPA);
    }  
}
