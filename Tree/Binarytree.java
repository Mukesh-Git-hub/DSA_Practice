package Tree;

import java.util.Scanner;



public class Binarytree {

    public Binarytree() {




}



private static class Node{
        int value;
        Node left;
        Node right;

    public Node(int value) {
        this.value=value;
    }
}
private Node root;

    public void populate(Scanner scanner) {
        System.out.println("enter the root node");
        int value = scanner.nextInt();
        root=new Node(value);
        populate(scanner,root);
    }

    public void populate(Scanner scanner,Node node){
        System.out.println("do you want to enter the left child"+node.value);
        boolean commit = scanner.nextBoolean();
        if (commit) {
            System.out.println("enter the left child");
            int value=scanner.nextInt();
            node.left = new Node(value);
            populate(scanner,node.left);
        }
        System.out.println("do you want to enter the right child"+node.value);
        boolean commit2 = scanner.nextBoolean();
        if (commit2) {
            System.out.println("enter the right child");
            int value=scanner.nextInt();
            node.right=new Node(value);
            populate(scanner,node.right);
        }
    }

    public void  display() {
        display(this.root,"");
    }

    public void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent+ node.value);
        display(node.left,indent+ "\t");
        display(node.right,indent+ "\t");
    }

}

