interface A 
{
    public void show(); 
}

public class Mylambda 
{
    public static void main(String[] args) {

        // A obj = new A()  //anonymous class
        // {
        //     public void show()
        //     {
        //         System.out.println("Hi");
        //     }
        // };
        // obj.show();

        //code using lambda


        A obj = () -> System.out.println("Hi");

        
        obj.show();




    }
}