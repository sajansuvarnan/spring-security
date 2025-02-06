import java.util.Scanner;

public class MyArray {
    

    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);


        System.out.println("Enter the Size of the array:");


        int n = obj.nextInt();

        int [] arr =new int [n];

        int Sum = 0;

        for (int i = 0; i < n; i++) {

            System.out.printf("Enter the value %d : ",i+1);
            arr[i] = obj.nextInt();

            Sum = arr[i] + Sum;
        }

        System.out.println("-----------------------------");

        System.out.printf("Sum of Array : %d",Sum);

        System.out.println("\n-----------------------------");

        obj.close();


    }
}
