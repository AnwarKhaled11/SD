package assig2_sec2;
public class Person 
{
    private String name ,address ,email_address,phone_Number;

    public Person() 
            
    {
        
    }
    
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }

    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }

    public void setEmail_address(String email_address)
    {
        this.email_address = email_address;
    }

    public String getEmail_address() 
    {
        return email_address;
    }

    public void setPhone_Number(String phone_Number) 
    {
        this.phone_Number = phone_Number;
    }
    
    public String getPhone_Number() 
    {
        return phone_Number;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + '}';
    }
    
}