package Week3;



class employee 
{
 String name ="sajan";
 int id =10515;
 private int Banknumber =1431414;   //encapsulation

public int getBanknumber() {
    return Banknumber;
}


}


public class encap {

public static void main(String args[])
{
       
        employee obj = new employee();
        //obj.name 
        //obj.id 

        System.err.println(obj.name);
        System.err.println(obj.getBanknumber());
        

}}