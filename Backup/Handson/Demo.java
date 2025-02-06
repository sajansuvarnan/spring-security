//anonymous innerclass

class A 
{
    public void show ()
    {
        System.out.println("In A class");
    }
}

class B extends A 
{
    public void show ()
    {
        System.out.println("In B class");
    }
}

public class Demo {

    public static void main(String[] args) {
        
        A obj = new B()
        {
            public void show ()
            {
                System.out.println("In Demo class");
            }
        };

        obj.show();
    }


    
}
