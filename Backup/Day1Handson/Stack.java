package Day1Handson;

public class Stack {

    int[] ar = new int[5];

    int top = -1;
    int size = ar.length;

    public void add(int val) {
        top++;

        if (top < size) {
            ar[top] = val;
        } else {
            System.out.println("Stack overflow");
        }
    }

    public int pop() {

        if (top !=-1) {
           return(ar[--top]);
        } else {
            System.out.println("Stack undeflow");
        }

        return 0;
    }

    public void printstack() {

        for (int i : ar) {
            System.out.print(i + " ");
        }

    }

}
