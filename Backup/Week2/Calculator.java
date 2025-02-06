package Week2;

public class Calculator {

    public static void main(String a[]) {

        int a1 = 10;
        int b1 = 20;

        suma ob = new suma();

        int result = ob.addfunction(a1,b1);

        System.out.println(result);

    }
    
}

class suma
{
    public int addfunction(int a, int b)
    {
        int c = a+b;
        return(c);

    }
}
