class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class class51 {

    void removeLoop(Node listNode, Node loopNode){
        Node temp = loopNode;
        int size = 1;
        while(loopNode.next != temp){
            loopNode = loopNode.next;
            size++;
        }
        Node head = listNode;
        Node slow = head;
        Node fast = head;

        for(int i=0; i<size; i++){
            fast = fast.next;
        }

        while(slow.next != fast.next){
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;

    }

    public static void main(String[] args) {
        
    }
}
