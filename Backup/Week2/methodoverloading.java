public class Calculator
{
    public int add(int a1, int a2)
    {
        return a1+a2;
    }

    public int add(int a1, int a2, int a3)
    {
        return a1+a2+a3;
    }
}



public class methodoverloading {

    public static void main(String[] args) {
        
        int a = 10;
        int b = 11;
        int c = 12;

        Calculator obj = new Calculator();

        int result = obj.add(a,  b, c);

        System.out.println(result);



    }
}
