public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size=0;
    }
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;

        if(tail==null) {
            tail = head;
        }
        size+=1;
    }
    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size += 1;
    }
    public void insert(int val,int index) {
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp=head;
        for (int i = 1; i <index ; i++) {
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;
    }
    //deletion
    public int deleteFirst(){
        int val= head.value;
        head=head.next;
        if(head == null){
            tail =null;
        }
        size--;
        return val;
    }

        public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node SecondLast=get(size-2);
        int val= tail.value;
        tail=SecondLast;
        tail.next=null;
        return val;
    }
        public int  delete(int index){
        if(index==0){
           return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node prev=get(index-1);
        int val=prev.next.value;
        prev.next=prev.next.next;
        return val;
        }

    public Node get(int index){
        Node node=head;
        for (int i = 0; i <index ; i++) {
            node=node.next;
        }
        return node;
    }
    public int find(int value){
        Node node=head;
          int index=0;
        while(node!=null){
            if(node.value==value){
                return index;
            }
            node=node.next;
            index++;
        }
        return index;
    }

    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
    public void duplicate(){
        Node temp=head;
        while(temp.next !=null){
            if(temp.value==temp.next.value){
                temp.next=temp.next.next;
                size--;
            }else{
                temp = temp.next;
            }
        }
        tail=temp;
        tail.next=null;
    }

   /* public static void main(String[] args) {
        LL list = new LL();
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(2);
        list.insertLast(3);
        list.display();
        list.duplicate();
        list.display();

    }*/
    public static LL merge(LL first,LL second){
        Node s= first.head;
        Node s1= second.head;

        LL ans =new LL();

        while( s != null&& s1!=null){
            if(s.value<s1.value){
                ans.insertLast(s.value);

                s=s.next;
            }else{
                ans.insertLast(s1.value);
                s1=s1.next;
            }
        }
        while(s!=null){
            ans.insertLast(s.value);
            s = s.next;
        }
        while(s1!=null){
            ans.insertLast(s1.value);
            s1=s1.next;
        }
        return ans;
    }

    public static void main(String[] args) {

        LL s=new LL();
        LL b=new LL();
        s.insertLast(2);
        s.insertLast(6);
        s.insertLast(8);
        s.insertLast(2);
        b.insertLast(0);
        b.insertLast(9);
        b.insertLast(2);
        b.insertLast(1);
        LL ans=LL.merge(s,b);
        ans.display();
    }

}
