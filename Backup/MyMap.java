import java.util.HashMap;
import java.util.Map;

public class MyMap {

    public static void main(String[] args) {
        
        Map<String, Integer> st1 = new HashMap<>();

        st1.put("sajan", 12);
        st1.put("soorej", 72);
        st1.put("sajan", 30);

        System.out.println(st1); //{soorej=72, sajan=30}
        System.out.println(st1.get("sajan")); //30


        for(String key : st1.keySet())
        {
            System.out.println(key+" "+st1.get(key));
        }
    }
    
}
