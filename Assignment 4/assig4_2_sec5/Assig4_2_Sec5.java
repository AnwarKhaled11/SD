package assig4_2_sec5;
public class Assig4_2_Sec5 {

    public static void main(String[] args)
    {
     Abstract_Factory Member_Factory1 = Factor_Producer.Get_Factory("is");
     Staff S1 = Member_Factory1.Get_Staff("Doctor");
     S1.GetSalary();
     S1.getYearsOfWork();
     Staff S11 = Member_Factory1.Get_Staff("Teacing Assistant");
     S1.GetSalary();
     S1.getYearsOfWork();
     
     Abstract_Factory Member_Factory2 = Factor_Producer.Get_Factory("cs");
     Staff S2 = Member_Factory2.Get_Staff("Doctor");
     S1.GetSalary();
     S1.getYearsOfWork();
     Staff S22 = Member_Factory2.Get_Staff("Teacing Assistant");
     S1.GetSalary();
     S1.getYearsOfWork();
     
     Abstract_Factory Member_Factory3 = Factor_Producer.Get_Factory("it");
     Staff S3 = Member_Factory3.Get_Staff("Doctor");
     S1.GetSalary();
     S1.getYearsOfWork();
     Staff S33 = Member_Factory2.Get_Staff("Teacing Assistant");
     S1.GetSalary();
     S1.getYearsOfWork();
    }   
}