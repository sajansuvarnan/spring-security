package Week5;

public class Myexception {

    public static void main(String[] args) {
        
        int a = 10;
        int b = 5;
        int c = 0;


        try 
        {
            b = a/b;

            if(c==0)
              throw new ArithmeticException("You have zero in input");
            
        }
        catch(Exception e)
        {
            System.out.println("Error observed");

        }

        System.out.println(b);

    }


    
}
