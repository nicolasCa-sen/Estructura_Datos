package logic;

public class Node<T> {

    private T info;

    private Node<T> next;

    public Node(T info, Node<T> next) {
        this.info = info;
        this.next = null;
    }

    public Node(T info2) {
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

   

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    

}
