public class Node<E> {
    E value;
    Node<E> next;
    Node<E> previous;

    public Node(E value) {
        this.value = value;
        this.next = null;
        this.previous = null;
    }

    public E getValue() { return value; }

    public Node<E> getNext() {
        return next;
    }

    public Node<E> getPrevious() {
        return previous;
    }

    public void setValue(E val) {
        value = val;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public void setPrevious(Node<E> previous) {
        this.previous = previous;
    }
}
