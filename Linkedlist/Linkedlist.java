package Linkedlist;

public class Linkedlist {
    Nodecreator head;



    public void add(int data) {
        Nodecreator newnode= new Nodecreator(data);
        if (head == null) {
           head= newnode;
           return;
        }
        Nodecreator current = head;

        while(current.next!=null){
           current= current.next;
        }
     current.next=newnode;
    }

    public void delete(int data) {
        if (head == null) {
            System.out.println("empty linked list");
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Nodecreator current=head;
        Nodecreator prev=null;
        while (current != null && current.data != data) {
            prev=current;
            current = current.next;
        }
        if (current == null) {
            System.out.println("not found");
            return;
        }
        prev.next = current.next;
    }


    public void print() {
        Nodecreator current= head;
        while (current != null) {
            System.out.print(current.data+"->");
            current=current.next;

        }
        System.out.println("null");
    }

}
