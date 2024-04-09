class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class class50 {

    void removeLoop(Node listNode, Node loopNode){
        Node temp = loopNode;
        while(true){
            while(loopNode.next != listNode.next && loopNode != temp){
                loopNode = loopNode.next;
            }
            if(listNode.next == loopNode.next){
                loopNode.next = null;
                return;
            }
            listNode = listNode.next;
        }
    }

    public static void main(String[] args) {
        
    }
}
