package Meenu;

public class Doublelinkedlist {
    private NodeCreatorDL head, tail;

    void add(int data) {
        NodeCreatorDL newnode = new NodeCreatorDL(data);
        if (head == null) {
            head = tail = newnode;
            return;
        }

        tail.address = newnode;
        newnode.prev=tail;
        tail=newnode;

    }
  void addfirst(int data){
      NodeCreatorDL newnode = new NodeCreatorDL(10);
      if (head == null) {
          head = tail = newnode;
          return;
      }
      newnode.next=head;
      head.prev=newnode;
      head=newnode;
  }

}