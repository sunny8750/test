public class DLL {
    private Node head;

    private Node tail;
     private class Node{

         private int value;
         private Node next;
         private Node prev;

         public Node(int value) {
             this.value = value;
         }
         public Node(int value, Node next, Node prev) {
             this.value = value;
             this.next = next;
             this.prev = prev;
         }
     }
         public void insertFirst(int val){
             Node node=new Node(val);
             node.next=head;
             node.prev=null;
             if(head!=null) {
                 head.prev =node;
             }
             if(tail==null) {
                 tail = head;
             }
             head=node;
         }
         public void display(){
             Node temp=head;
             while(temp!=null){
                 System.out.print(temp.value+"->");
                 temp=temp.next;
             }
             System.out.println("null");
         }
         public void displayrev(){
             Node node=tail;
             while(node !=null){
                 System.out.print(node.value+" ->");
                 node =node.prev;
             }

         }
    public void insertLast(int val){
        Node node = new Node(val);
        tail.next = node;
        node = tail;
        tail = node.prev;
        node=tail;
    }
    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insert(int after, int val) {
        Node p = find(after);

        if (p == null) {
            System.out.println("does not exist");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }
    }






}
