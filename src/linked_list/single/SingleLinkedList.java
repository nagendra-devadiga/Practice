package linked_list.single;

public class SingleLinkedList {
    private int count = 0;
    private Node start;
    private Node last;

    private class Node {
        int data;
        Node next;

        private Node(int data) {
            this.data = data;
        }
    }

    synchronized public void insert(int data) {
        count++;
        if (start == null) {
            start = new Node(data);
            last = start;
            return;
        }
        last.next = new Node(data);
        last = last.next;
    }

    synchronized public void insertRecursive(int data) {
        start = insertRecursively(start, data);
    }

    private Node insertRecursively(Node node, int data) {
        if (node == null)
            return new Node(data);
        node.next = insertRecursively(node.next, data);
        return node;
    }

    synchronized void insertFirst(int data) {
        Node newnode = new Node(data);
        newnode.next = start;
        start = newnode;
        count++;
    }

    synchronized void insert(int data, int index) {
        if (index >= size()) {
            System.err.println(index + "out of bound");
        }
        Node newnode = new Node(data);
        Node temp = start;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        Node previous = temp.next;
        temp.next = newnode;
        newnode.next = previous;
        count++;
    }

    synchronized int size() {
        return count;

    }

    synchronized int getLast() {
        return last.data;
    }

    synchronized int getFirst() {
        return start.data;
    }

    synchronized void delete(int index) {
        if (index >= size()) {
            System.err.println(index + "out of bound");
        }
        Node curr = start;
        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }
        Node temp = curr.next;
        curr.next = temp.next;
        temp.next = null;
        count--;
    }

    synchronized void deleteFirst() {
        Node temp = start;
        start = start.next;
        temp.next = null;
        count--;
    }

    synchronized void deleteLast() {
        Node temp = start;
        int n = 0;
        while (n < size() - 2) {
            temp = temp.next;
            n++;
        }
        temp.next = null;
        last = temp;
        count--;

    }

    synchronized int search(int keyobj) {
        Node temp = start;
        int c = 0;
        while (temp != null) {
            c++;
            if (temp.data == keyobj) {
                return c;
            }
            temp = temp.next;
        }
        return -1;
    }

    synchronized int get(int index) {
        if (index >= size()) {
            return -1;
        }
        Node temp = start;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    synchronized public void display() {
        if (start == null) {
            return;
        }
        Node curr = start;
        while (curr != null) {
            System.out.print(curr.data + " --> ");
            curr = curr.next;
        }
        System.err.println(curr);
    }

    synchronized public void reverse() {
        Node curr = start;
        Node prev = null;
        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        start = prev;
    }
}
