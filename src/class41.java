class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class class41 {

    static void print(Node head){
        while(head != null){
            System.out.println(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(5);
        Node second = new Node(6);
        head.next = second;
        Node third = new Node(7);
        second.next = third;
        Node fourth = new Node(8);
        third.next = fourth;
        Node fifth = new Node(9);
        fourth.next = fifth;
        // System.out.println(head.data);
        // System.out.println(head.next.data);
        // System.out.println(head.next.next.data);
        // System.out.println(head.next.next.next.data);
        // System.out.println(head.next.next.next.next.data);

        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp);

        print(head);
        print(head);

        // System.out.println(head.next.next.next.next.next.data);
    }
}
