package linkedlist;

public class CustomLinkedList {
    public static void main(String[] args) {

        Node node =getNode();
        node = reverseNode(node);
        printNode(node);
        Node node1 =getNode();

    }

    private static Node reverseNode(Node node) {
        Node curr = node;
        Node prev = null;
        while (curr != null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr=temp;
        }
        return prev;
    }

    private static void printNode(Node head){
        Node curr = head;

        while (curr != null){
            System.out.print(curr.value);
            if (curr.next != null){
                System.out.print("->");
            }
            curr = curr.next;
        }
        System.out.println();
    }

    private static Node getNode() {
        Node node = new Node(1);
        node.add(2);
        node.add(2);
        node.add(3);
        node.add(4);
        node.add(5);
        node.add(5);
        node.add(6);
        node.add(6);
        node.add(7);

        //System.out.println(x);
        printNode(node);
        return node;
    }
}
