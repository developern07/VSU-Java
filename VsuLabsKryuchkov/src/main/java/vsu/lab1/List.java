package vsu.lab1;

/**
 * List model
 */
public class List {
	/** Header and tail of List **/
    private Node header, tail;
    
    /**
     * Constructor List
     * @param header List header
     */
    List() {
        header = new Node();
    }
 
    /**
     * Method of add value in list
     * @param value: int
     */
    void add(int value) {
        if (header.getNext() == null) {
            tail = new Node(value, null);
            header.setNext(tail);
        }
        else {
            Node tmp = new Node(value);
            tail.setNext(tmp);
            tail = tmp;
        }
    }
 
    /**
     * Method of print all value of list
     */
    void print() {
        Node tmp = header.getNext();
        while (tmp != null) {
            System.out.print(tmp.getValue() + " ");
            tmp = tmp.getNext();
        }
        System.out.println();
    }
 
    /**
     * Method of print value of list
     * @param index: int
     */
    void printNode(int index) {
        if (index >= 0 ) {
            Node tmp = header.getNext();
            while (index > 1 && tmp != null) {
                index--;
                tmp = tmp.getNext();
            }
            if (tmp != null) {
                System.out.println(tmp.getValue());
            } else {
                System.out.println("Элемент не существует");
            }
        } else {
            System.out.println("Элемент не существует");
        }
    }
 
    /**
     * Method of remove value of list
     * @param index: int
     */
    void remove(int index) {
        if (index >= 0 ) {
            Node tmp = header;
            while (index > 1 && tmp != null) {
                index--;
                tmp = tmp.getNext();
            }
            if (tmp.getNext() != null) {
                tmp.setNext(tmp.getNext().getNext());
            } else {
                System.out.println("Элемент не существует");
            }
        } else {
            System.out.println("Элемент не существует");
        }
    }
}