import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter any one operation [+  -  *  /] :");
        String operation = obj.nextLine();


        System.out.println("Enter value for A :");
        int A = obj.nextInt();
        
        System.out.println("Enter value for B :");
        int B = obj.nextInt();

        int C=0;

        obj.close();

        switch (operation) {
            case "+":
                C = A+B;
                break;

            case "-":
                C = A-B;
                break;  
                
            case "*":
                C = A*B;
                break;     
                
            case "/":
                C = A/B;
                break;     
        
            default:
                break;
        }

        System.out.printf("Output: %d", C);

    }
}
