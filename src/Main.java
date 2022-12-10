public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
      /*  LL list=new LL();
        list.insertFirst(0);
        list.insertFirst(9);
        list.insertFirst(6);
        list.insertFirst(64);
        list.insertFirst(7);  //inserting the value of LL from first node.
        list.insertLast(3);   //inserting the value of LL in last.
        list.insert(10,3);// inserting in any special position in LL.
        list.display();// displaying my linkedlist
        list.deleteFirst(); //deleting first value.
        list.deleteLast();//deleting last value.
        list.display();
        list.delete(2);// deleting random
        list.display();
        System.out.println(list.find(0));*/
        DLL list=new DLL();
        list.insertFirst(1);
        list.insertFirst(10);
        list.insertFirst(16);
        list.insertFirst(15);

        list.display();
        list.displayrev();
        list.insertLast(67);
        list.display();
        list.insert(16,2);
        list.display();

    }
}