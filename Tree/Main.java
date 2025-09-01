package Tree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Binarytree b = new Binarytree();
        b.populate(scanner);
        b.display();
    }
}
