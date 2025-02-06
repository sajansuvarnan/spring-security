package Week4;
class date 
{
    public void expense()
    {
        System.out.println("Movie and coffe");
    }

}

class dinner extends date
{
    public void expense()
    {
        System.out.println("Biriyani and chicken");
    }
}
public class DynamicMethod
{
    public static void main(String[] args) {
    
    date obj = new date();

    obj.expense();

    obj = new dinner();

    obj.expense();
    
    }

}