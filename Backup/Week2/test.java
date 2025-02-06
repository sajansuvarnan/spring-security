public class test {

    public static void main(String a[]) {

        int au = 10;
        int bu = 20;

        suma ob = new suma();

        int result = ob.addfunction(au,bu);

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
