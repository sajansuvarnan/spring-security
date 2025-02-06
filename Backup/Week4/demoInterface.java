interface A 
{
    public void show();
}

interface B extends A {

    public void print();
    
}

class mycode implements B
{
    public void show()
    {
        System.out.println("Hello world from show!!");
    }

    public void print()
    {
        System.out.println("Hello world from print!!");
    }

}


public class demoInterface {

    public static void main(String[] args) {
        
        //B obj = new mycode(); // this will work 
        //A obj = new mycode(); // this will not work

        mycode obj = new mycode();

        obj.show();
        obj.print();
    }
    
}
