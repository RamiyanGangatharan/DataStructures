public class SinglyLinkedList<E> {
    Node<E> head;
    int size;

    public SinglyLinkedList() {
        this.head = null;
        size = 0;
    }

    public void add(E val) {
        if (size == 0) {
            head = new Node<>(val);
            size++;
            return;
        }

        Node<E> cur = head;
        while (cur.getNext() != null) { cur = cur.getNext(); }
        cur.setNext(new Node<>(val));
        size++;
    }


    public E get(int ind){
        Node<E> cur = head;
        int count = 0;
        while (head != null) {
            if (count == ind) { return cur.getValue(); }
            cur = cur.getNext();
            count++;
        }
        return null;
    }

    public void set(int ind, E val){

    }

    // TODO
    public E remove(int ind){

        return null;
    }

    public int size(){
        return size;
    }

    public boolean contains(E val){
        return false;
    }

    public int indexOf(E val){
        return -1;
    }

    // TODO
    public void clear(){

    }

    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node<E> cur = head;
        while (cur != null) {
            result.append(cur.getValue());
            if (cur.getNext() !=  null) result.append(", ");
            cur = cur.getNext();
        }
        result.append("]");
        return result.toString();
    }
}