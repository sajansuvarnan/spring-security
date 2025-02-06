enum Status 
{
    Running, Failed, Pending, Success;
}

public class Myenum {

 public static void main(String[] args) {
    Status s = Status.Running;

    if(s == Status.Running)
    {
        System.out.println("Yes it is running");

    }

    switch(s)
    {
        case Running:
            System.out.println("Running");
            break;

        default:
            System.out.println("Not Running");

    }

 }
    
}
