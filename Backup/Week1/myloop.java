import java.util.Scanner;

public class myloop {
    public static void main(String[] args) {
       
        /*
        int i = 7;

        do
        {
            System.out.println("This is line no "+ i);
            i++;
        }while (i<=5);
 */
    System.out.println("How many stars you want madam?");

    Scanner maxie = new Scanner(System.in);
    int a= maxie.nextInt();  
    int b= a+1;

    String stro =" ";
    String repeatedau = stro.repeat(b+1);
    String repeatedbu = stro.repeat(b+1);

    System.out.println(repeatedau+"*");
     
    for(int i = 1; i<= a+1 ; i++)
    {

        String stra ="*";
        String repeated = stra.repeat(i);
        String strc ="*";
        String repeatedb = strc.repeat(i);
        String strb =" ";

        String repeatedspace = strb.repeat(b);
        System.out.println(repeatedspace + repeated+repeatedb);
        b--;
    }

    b =0+1;

        for(int i = a+1; i> 0 ; i--)
    {
        String stra ="*";
        String repeated = stra.repeat(i);
        String strc ="*";
        String repeatedb = strc.repeat(i);
        String strb =" ";
        String repeatedspace = strb.repeat(b);
        System.out.println(repeatedspace + repeated+repeatedb);
        b++;
    }

        System.out.println(repeatedbu+"*");

    }

}
