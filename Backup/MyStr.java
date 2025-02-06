import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyStr {

    public static void main(String[] args) {
        

        List<String> name = new ArrayList<>();

        name.add("sajan");
        name.add("suvarnan");
        name.add("soorej");
        name.add("sunitha");
        name.add("kasi");
        name.add("arun");
        name.add("sun");

        System.out.println(name);

        Collections.sort(name);
        System.out.println(name);

        

        Comparator<String> com = new Comparator<String>() {

            
            
            public int compare(String a , String b)
            {
                if (a.length()>b.length())
                    return 1;
                else 
                   return -1;
            }
        };

        Collections.sort(name,com);
        System.out.println(name);





    }
    
}
