package selsec1;
public class SelSec1 
{
    public static void main(String[] args) 
    {
       account customer1 = new account(1122,20000,4.5);
       customer1.withdraw(2500);
       customer1.deposit(3000);
        System.out.println("Balance Is : "+customer1.getBalance());
        System.out.println("Montoly AnnulInterest Rate Is : "+customer1.getMontolyAnnulInterestRate());
        System.out.println("Data Created Balance Is : "+customer1.getDatacreated());
                
    }
}
