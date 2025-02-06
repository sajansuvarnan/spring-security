package Day1Handson;

class node {
    int data;
    node next;

    public node(int data) {
        this.data = data;
        next = null;

    }

}

public class LinkedList {

    node head = null;

    public void add(int data) {
        node newNode = new node(data);

        node current = head; // first element 

        if (head == null) {
            head = newNode;
        } else {

            while (current.next != null) 
                current = current.next; //moving the element to last

            current.next = newNode;

        }

        while( current!= null)
        {
            System.out.println(current.data+" ");
            current = current.next;
        }
    }

}
