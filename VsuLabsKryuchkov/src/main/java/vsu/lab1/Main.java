package vsu.lab1;

/**
 * Main function, where we test different actions (add, remove, print, printNode)
 */
public class Main {
    public static void main(String[] args) {
        List list = new List();
        for (int i = 0; i < 10; i++)
            list.add(i+1);
        list.print();
        list.remove(1);
        list.add(100);
        list.remove(9);
        list.remove(3);
        list.print();
        list.printNode(4);
    }
}