package vsu.lab1;

/**
 * Node model
 */

public class Node {
	/** Value **/
    private Integer value;
    /** Next value **/
    private Node next;
 
    /**
     * Method of getting a value
     * @return value: int
     */
    int getValue() { return value; }
    /**
     * Method of setting a value
     * @param value: int
     */
    void setValue(int value) { this.value = value; }
    
    /**
     * Method of getting a next value
     * @return next: Node
     */
    Node getNext() { return next; }
    /**
     * Method of setting a next value
     * @param next: Node
     */
    void setNext(Node next) { this.next = next; }
 
    /**
     * Constructor Node
     * @param value Node value
     * @param next Node next value
     */
    Node() {
        value = null;
        next = null;
    }
    
    /**
     * Constructor Node
     * @param value Node value
     * @param next Node next value
     */
    Node(int value) {
        this.value = value;
        next = null;
    }
    
    /**
     * Constructor Node
     * @param value Node value
     * @param next Node next value
     */
    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}