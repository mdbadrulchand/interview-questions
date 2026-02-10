package linkedlist;

public class Node {
    int value;
    Node next;

    public Node(int value){
        this.value = value;
        this.next = null;

    }

    public void add(int value){

        Node curr = this;
        while (curr.next != null){
            curr = curr.next;
        }
        curr.next = new Node(value);
    }
}
