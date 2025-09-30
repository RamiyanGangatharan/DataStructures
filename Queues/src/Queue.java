public class Queue<E> {
    // LinkedList style

    private class Node<E> {
        private E value;
        private Node<E> next;

        private E getValue() { return value; }
        private void setValue(E value) { this.value = value; }

        private Node<E> getNext() { return next; }

        private void setNext(Node<E> next) { this.next = next; }

        private Node(E value){
            this.value = value;
        }
    }

    private int size;
    private Node<E> front;
    private Node<E> back;

    public Queue()
    {
        this.size = 0;
        this.front = null;
        this.back = null;
    }

    public int size() { return this.size; }
    public boolean isEmpty() { return size == 0; }
    public E peek(){
        if (this.size == 0) { return null; }
        else { return this.front.value; }
    }

    // TODO: enqueue(), dequeue()

    public E enqueue(E value) {
        Node node = new Node(value);

        if (this.size == 0) { this.front = node; }
        else { this.back.next = node; }
        this.back = node;
        size++;
        return value;
    }

    public E dequeue() {
        if (this.size == 0) { return null; }
        else {
            E value = this.front.value;
            this.front = this.front.next;
            this.size--;
            if (this.size == 0) { this.back = null; }
            return value;
        }
    }
}
