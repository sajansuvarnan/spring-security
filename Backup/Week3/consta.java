package Week3;

class hello
{

    private int id;

    public hello()       //Default constructor
    {
        System.out.println("This is constructor");
    }
	
	    public hello(int i)       //Parametralized constructor
    {
	    this.id = i;
        System.out.println(id);
    }
	
	
}

public class consta {

    public static void main (String args[])
    {
        hello obj = new hello();
		hello obj1 = new hello(10);
    }
    
}