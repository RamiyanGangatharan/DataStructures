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
        while (cur.getNext() != null) {
            cur = cur.getNext();
        }
        cur.setNext(new Node<>(val));
        size++;
    }

    public E get(int ind) {
        if (ind < 0 || ind >= size) {
            throw new IndexOutOfBoundsException("Index: " + ind + ", Size: " + size);
        }
        Node<E> cur = head;
        int count = 0;
        while (cur != null) {
            if (count == ind) return cur.getValue();
            cur = cur.getNext();
            count++;
        }
        return null;
    }

    public void set(int ind, E val) {
        if (ind < 0 || ind >= size) {
            throw new IndexOutOfBoundsException("Index: " + ind + ", Size: " + size);
        }
        Node<E> cur = head;
        int count = 0;
        while (cur != null) {
            if (count == ind) {
                cur.setValue(val);
                return;
            }
            cur = cur.getNext();
            count++;
        }
    }

    public E remove(int ind) {
        if (ind < 0 || ind >= size) {
            throw new IndexOutOfBoundsException("Index: " + ind + ", Size: " + size);
        }

        if (ind == 0) {
            // removing head
            E val = head.getValue();
            head = head.getNext();
            size--;
            return val;
        }

        Node<E> cur = head;
        int count = 0;
        while (cur != null) {
            if (count == ind - 1) {
                Node<E> removed = cur.getNext();
                cur.setNext(removed.getNext());
                size--;
                return removed.getValue();
            }
            cur = cur.getNext();
            count++;
        }
        return null;
    }

    public int size() {
        return size;
    }

    public boolean contains(E val) {
        Node<E> cur = head;
        while (cur != null) {
            if (cur.getValue().equals(val)) return true;
            cur = cur.getNext();
        }
        return false;
    }

    public int indexOf(E val) {
        Node<E> cur = head;
        int index = 0;
        while (cur != null) {
            if (cur.getValue().equals(val)) return index;
            cur = cur.getNext();
            index++;
        }
        return -1;
    }

    public void clear() {
        head = null;
        size = 0;
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
