package selsec1;

import java.util.Date;

class account 
{

    private int id=0;
    private double balance=0;
    private double annulInterestRate=0;
    private Date datacreated=new java.util.Date();

    public account ()
    {

    }
    public account (int id,double balance,double annulInterestRate)
    {
        this.id=id;
        this.balance=balance;
        this.annulInterestRate=annulInterestRate;
    }
    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public double getBalance() 
    {
        return balance;
    }

    public void setBalance(double balance) 
    {
        this.balance = balance;
    }

    public double getAnnulInterestRate() 
    {
        return annulInterestRate;
    }

    public void setAnnulInterestRate(double annulInterestRate) 
    {
        this.annulInterestRate = annulInterestRate;
    }

    public Date getDatacreated() {
        return datacreated;
    }

    public void setDatacreated(Date datacreated) 
    {
        this.datacreated = datacreated;
    }
    public double getMontolyAnnulInterestRate() 
    {
        return annulInterestRate/12;
    }
   public double withdraw (double amount)
   {
    return balance-amount;
   }
    public double deposit (double amount)
    {
        return balance+amount;
    }    
}