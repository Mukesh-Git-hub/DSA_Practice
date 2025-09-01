package Meenu;

public class Linkedlist {
    NodeCreator head = null;

    void add(int data) {
        NodeCreator node = new NodeCreator(data);
        if (head == null) {
            head = node;
            return;
        }
        // Traverse to the last node
        NodeCreator current = head;
        while (current.address != null) {
            current = current.address;
        }
        // Attach new node at the end
        current.address = node;
    }

    void print() {
        NodeCreator current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.address;
        }
        System.out.println("null");}

    void firstinsert(int data) {
        NodeCreator node = new NodeCreator(data);
        node.address = head;
        head = node;
    }
}
