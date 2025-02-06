class statement
{
    public static void main(String[] args) {
        

        int x = 5;
        int y = 10;
        int z = 20;

        String result;

        result = (x>y) && (x>z) ? "X is big" : (y>z)? "Y is big" : "z is big";

        System.out.println(result);



      /*   if (x>y && x>z)
         System.out.println(x);

        else if(y>z)
         System.out.println(y);

         else 
          System.out.println(z); */
    }
}