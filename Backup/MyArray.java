import java.util.ArrayList;
import java.util.List;

public class MyArray {

    public static void main(String[] args) {
        
        List<Integer> num = new ArrayList<Integer>();

        num.add(5);
        num.add(6);
        num.add(6);

        for(int i : num)
        {
            System.out.println(i);
        }
    }
}
