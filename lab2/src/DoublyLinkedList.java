public class DoublyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    // default constructor for the base object of said doubly linked list
    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int getLength() { return size; }

    // This class makes sure the head exists before creating another node, if it doesnt find one, then it becomes the head.
    public void addToFront(E value) {
        Node<E> newNode = new Node<>(value);
        if (head == null) { head = tail = newNode; }
        else {
            newNode.setNext(head);
            head.setPrevious(newNode);
            head = newNode;
        }
        size++;
    }

    // as long as the head exists, the front of a list can be removed
    public E removeFromFront() {
        if (head == null) throw new IllegalStateException("List is empty");

        E val = head.getValue();
        head = head.getNext();

        if (head != null) { head.setPrevious(null); }
        else { tail = null; }
        size--;
        return val;
    }

    public void addToEnd(E value) {
        Node<E> newNode = new Node<>(value);
        if (tail == null) { head = tail = newNode; }
        else {
            tail.setNext(newNode);
            newNode.setPrevious(tail);
            tail = newNode;
        }
        size++;
    }

    public E removeFromEnd() {
        if (tail == null) throw new IllegalStateException("List is empty");
        E val = tail.getValue();
        tail = tail.getPrevious();
        if (tail != null) { tail.setNext(null); }
        else { head = null; }
        size--;
        return val;
    }

    // This method traverses the linkedlist forwards then compares each element to the given value.
    public boolean contains(E value) {
        Node<E> current = head;
        while (current != null) {
            if (current.getValue().equals(value)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }


    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node<E> cur = head;
        while (cur != null) {
            result.append(cur.getValue());
            if (cur.getNext() != null) result.append(", ");
            cur = cur.getNext();
        }
        result.append("]");
        return result.toString();
    }

}
