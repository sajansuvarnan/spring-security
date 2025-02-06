package Week3;
class parent
{
    public parent()
    {
        super();
        System.out.println("This is default constructor in parent class");

    }

    public parent(int n)
    {
        super();
        System.out.println("This is parameterized constructor in parent class");

    }

}

class child extends parent
{

    public child()
    {
        super(10);
        System.out.println("This is default constructor in child class");
        

    }

    public child(int m)
    {
        this();
        System.out.println("This is parameterized constructor in child class");
    }

}

public class superclass {
    
    public static void main(String[] args) {

        child obj = new child(19);
        
    }
}
