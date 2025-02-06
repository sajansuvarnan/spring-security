public class stringbuffertopic {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();

        
        System.out.println(sb1.capacity());

        StringBuffer sb = new StringBuffer("Hello");

        System.out.println(sb.capacity());
       

        sb.append(" Sajan how are u doing");

        sb.deleteCharAt(3);
        sb.insert(3, 'l');

        System.out.println(sb);
        System.out.println(sb.capacity());

        


    }

}
