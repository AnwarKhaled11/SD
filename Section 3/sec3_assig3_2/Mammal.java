package sec3_assig3_2;
public class Mammal implements Animal
{
    @Override
    public void Eat() 
    {
        System.out.println("Most mammals eat grass");
    }

    @Override
    public void Travel() 
    {
        System.out.println("Most mammals are fast-moving and mobile");
    }
    
    public void NumOfLegs()
    {
        System.out.println("The number of legs of mammals is ");
    }
    public void FavoriteFood()
    {
        System.out.println("The Favorite Food For Mammal is leaves, stems, roots and nuts");
    }
}