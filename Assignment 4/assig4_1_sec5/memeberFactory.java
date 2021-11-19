package assig4_1_sec5;

public class memeberFactory 
{
 public Staff Get_Member (String Member_Name)
 {
     String Member1 = Member_Name.toLowerCase();
     if (Member_Name.equalsIgnoreCase("Doctor")) 
     {
         return new Doctor();
     }
     else if (Member_Name.equalsIgnoreCase("Teaching Assistant")) 
     {
         return new TeachingAssistant();
     }
     return null;
//     switch(Member1)
//     {
//         case "TeachingAssistant" : 
//             return new TeachingAssistant();
//         case "Doctor" :
//             return new Doctor();
//         default :      
//             return null;
     
 }
}
