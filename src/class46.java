class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class class46 {

    static Node reversedList(Node head){
        Node prev = null;
        Node next = null;
        Node curr = head;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
        // head = prev;
        // return head;
    }

    public static void main(String[] args) {
        
    }
}
