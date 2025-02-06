package Day1Handson;
import java.util.Scanner;

class Mobile
{
    public void mycal(int a, int b, String c)
    {
        switch (c) {
            case "+":
               System.out.println("Your Output is :"+(a+b));
               break;
            
           case "-":
                System.out.println("Your Output is :"+(a-b));
                break;

            case "*":
                System.out.println("Your Output is :"+(a*b));
                break;
               
            case "/":
                System.out.println("Your Output is :"+(a/b));
                break;
                
            default:
               System.out.println("Invalid Operation");;

        }
    }


}

public class calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value for a:");
        int a = sc.nextInt();

        System.out.println("Enter the value for b:");
        int b = sc.nextInt();


        System.out.println("Enter any of the operation: + - * /\n");
        String c = sc.next();

        Mobile mb = new Mobile();


        mb.mycal(a,b,c);

        sc.close();
        
    }



}
    
