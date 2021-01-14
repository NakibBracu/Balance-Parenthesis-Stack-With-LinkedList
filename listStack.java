public class listStack implements stack{
    Node head;
    public listStack(){
    head = null;
    }
    public  void push(char e){
        Node n = new Node(e,head);
        head = n; // setting top elements in the head
    }
    public  char peek(){
        if(head==null){
            System.out.println("Stack underflow");
            return 0;
        }
        return head.element;
    }
    public  char pop(){
        if(head==null){
            System.out.println("Stack underflow");
            return 0;
        }
        Node remove = head;
        head = head.next;
        remove.next = null;
        
        return remove.element;
    }
    public boolean isEmpty(){
    if(head==null){
    return true;
    }
    return false;
}
}