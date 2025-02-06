package Day1Handson;

public class Demo {

    public static void main(String[] args) {

        Queue n = new Queue();

        n.enqueue(19);

        n.enqueue(22);

        n.enqueue(33);

        n.enqueue(43);
        n.dequeue();
        n.enqueue(53);


        n.show();
        System.out.print(n.peek());
    }

   
}
