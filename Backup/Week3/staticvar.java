package Week3;
class phone 

{
   static String name;
   String a="**";

   static 
   {
    String name = "hello";
   }

   public void redmi()
   {
    System.out.println(a);
    System.out.println(name);
   }

}


public class staticvar {

    phone ph = new phone();

    ph.redmi();
}
