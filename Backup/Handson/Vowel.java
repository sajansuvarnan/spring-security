import java.util.Scanner;
public class Vowel {

    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in); 


        System.out.println("-----------------------------------\nPress 1: For Number Swap Program");
        System.out.println("Press 2: For Vowel Program\n-----------------------------------");
        

        System.out.println("Enter the Input:");

        int n = obj.nextInt();


        if(n==1)
        {

            System.out.println("Enter the value for A");

            int a = obj.nextInt();

            System.out.println("Enter the value for B");

            int b = obj.nextInt();

            a = a + b;

            b = a - b;

            a = a - b;

            System.out.println("Current value of A is "+a);
            System.out.println("Current value of B is "+b);

        }

        else if(n ==2)

        {
            System.out.println("Enter the String:");

            obj.nextLine();

            String name = obj.nextLine();
            
            
            if( name.contains("a") || name.contains("e") || name.contains("i")|| name.contains("o")||name.contains("u"))
            {
                System.out.println("String have a vowel letter");
            }
            else
            {
                System.out.println("String dosen't have any vowel letter");
            }

        }

        else 
        {
            System.out.println("Invalid Input");
        }

        obj.close();

    }
    
}
