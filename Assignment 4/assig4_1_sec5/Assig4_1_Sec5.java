package assig4_1_sec5;
import java.util.Scanner;
public class Assig4_1_Sec5 
{
public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Job Title");
        String Job_Title = input.nextLine();       
        memeberFactory Member = new memeberFactory();
        Staff S = Member.Get_Member(Job_Title);
        S.GetSalary();
        S.getYearsOfWork();
    }  
}