package Week4;

abstract class vehicle 
{
    public abstract void  engine();
    public abstract void brake();
}

class car extends vehicle
{
    public void engine()
    {
        System.out.println("Start");

    }
    
    public void brake()
    {
        System.out.println("Stop");
    }

} 

public class Demo {

    public static void main(String[] args) {
        vehicle obj = new car();

        obj.engine();
        obj.brake();


    }
    
}
