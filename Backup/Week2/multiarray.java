import java.util.Random;

public class multiarray {
    

    public static void main(String[] args) {
        
        int a[][] = new int[4][4];

        for(int i = 0; i<4; i++)
        {
            for(int j= 0;j<4;j++)
            {
                a[i][j] = (int) Math.random() * 100;   
            }
        }

        for(int i = 0; i<4; i++)
        {
            for(int j= 0;j<4;j++)
            {
                System.out.print( a[i][j] + " ");
            }
             System.out.println();
        }

        System.out.println();


        for(int ab[] : a)
        {
            for(int ai: ab)
            {
                System.out.print( ai + " ");
            }
             System.out.println();
        }


    }
}
