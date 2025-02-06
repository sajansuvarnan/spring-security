import java.util.Scanner;

public class MyString {

    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the string:");

        String str = obj.nextLine();

        String strreverse ="";


        for(int i= str.length()-1 ; i>=0;i--)
        {
            strreverse = strreverse + str.charAt(i);            
        }

        if (str.equalsIgnoreCase(strreverse))
        {
            System.out.println(str+" is a palindrome");

        }
        else
        {
            System.out.println(str+" is not a palindrome");
        }

        obj.close();

    }

    
}
