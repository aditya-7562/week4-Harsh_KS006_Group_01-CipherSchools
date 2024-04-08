class Node{

    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class class45 {

    static int getNthFromLast(Node head, int n){
        Node slow = head;
        Node fast = head;

        for(int i=0; i<n; i++){
            if(fast == null) return -1;
            fast = fast.next;
        }

        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
    } 

    public static void main(String[] args) {
        
    }
}
