package Day1Handson;

public class Queue {

    int front = 0;
    int rear = -1;
    int size = 0;

    int[] ar = new int[4];

    public void enqueue(int data) {

        if (size < 4) {
            rear = (rear + 1)%4;

            ar[rear] = data;
            size++;
        } else {
            System.out.println("Max limit reached");
        }

    }

    public int dequeue() {
        if (size != 0) {
            int val = ar[front];
            front = front + 1;
            size--;
            return (val);

        } else {
            System.out.println("No Entry");
        }

        return 0;

    }

    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.println(ar[i] + " ");
        }
    }

    public int peek() {

        return(ar[front]);
    }

}
