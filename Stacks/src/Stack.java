public class Stack<E> {
    private class Node<E> {
        E value;
        Node<E> next;

        public Node(E value) {
            this.value = value;
            this.next = null;
        }

        public E getValue() { return value; }
        public void setValue(E value) { this.value = value; }
        public Node<E> getNext() { return next; }
        public void setNext(Node<E> next) { this.next = next; }
    }

    private Node<E> top;
    private int size;

    public Stack()
    {
        this.top = null;
        this.size = 0;
    }

    public int size() { return size; }
    public E peek() { return (size == 0) ? null : top.getValue(); } // Ternary op to make it clean

    // TODO: push(), pop(), isEmpty()

    public void push(E value)
    {
        Node<E> pusherNode = new Node<>(value);
        pusherNode.setNext(this.top);
        this.top = pusherNode;
        size++;
    }

    public E pop() {
        if (this.size == 0) return null;
        E value = this.top.value;
        this.top = this.top.next;
        size--;
        return value;
    }

    public Boolean isEmpty()
    {
        return size == 0;
    }
}
