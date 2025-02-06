package Week3;
class basicCal
{

    public int add (int n1, int n2)
    {
        return n1+n2;
    }
}

class advancedCal extends basicCal
{
    public int add (int n1, int n2)
    {
        return n1+n2+n1;
    }

}

public class mycal {

    public static void main(String[] args) {
        
        basicCal obj = new basicCal();

        int st= obj.add(4, 5);
        System.out.println(st);

    }
    
}
