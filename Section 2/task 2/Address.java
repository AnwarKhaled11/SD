package assig_sec2_2;

public class Address extends Student
{
    int Street_No;
    String city,country;
   
//    public Address(int Street_No,String city,String country) 
//    {
//     this.Street_No=Street_No;
//     this.city=city;
//     this.country=country;
//    }
public  void Student_Address(String country,String city,int Street_No) 
    {
        System.out.println("Student country is : " + country+"Student City is : "+ city+" Street No is : "+Street_No);
    } 
}
