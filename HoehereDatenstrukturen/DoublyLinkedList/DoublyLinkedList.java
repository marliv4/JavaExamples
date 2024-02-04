public class DoublyLinkedList<T> {
    private Node<T> head;
    private Node<T> curr;
    private Node<T> last;
    private int     size;

    public DoublyLinkedList() {
        head = null;
        curr = null;
        last = null;

        size = 0;
    }

    public DoublyLinkedList(T data) {
        head = new Node<T>(data);
        head.setPrev(null);
        head.setNext(null);        
    }

    public boolean empty() {
        return head == null;
    }

    public void insertAtBegin(T data) {
        if (empty()) {
            head = last = new Node<T>(data);

            head.setPrev(null);
            head.setNext(null);
        } else {
            Node<T> newly = new Node<T>(data);
            newly.setPrev(null);
            newly.setNext(head);

            head.setPrev(newly);
            head = newly;
        }

        size++;
    }
    
    public void insertAtEnd(T data) {
        // 1. Fall: leere Liste.
        if (empty()) {
            head = last = new Node<T>(data);
            
            head.setPrev(null);
            head.setNext(null);   
            
            size++;
            return;
        }

        // Ansonsten wird ein neuer Knoten erstellt.
        Node<T> newNode = new Node<T>(data);
        newNode.setPrev(last);
        newNode.setNext(null);

        last.setNext(newNode);
        last = newNode;

        size++;
    }

    public void traverse() {
        if (empty()) {
            System.out.println("DoublyLinkedList ist leer.");
            return;
        }

        curr = head;
        while (curr != null) {
            System.out.print(curr.getData() + " ");
            curr = curr.getNext();
        }
        System.out.println();
    }

    public void deleteByValue(T value) {
        if (empty()) {
            return;
        }

        if (head.getData().equals(value)) {
            var nextNode = head.getNext();
            head = nextNode;
            head.setPrev(null);
        
            size--;
            return;
        }

        curr = head;
        while (curr != null) {
            if (curr.getData().equals(value)) {
                Node<T> prevNode = curr.getPrev();
                Node<T> nextNode = curr.getNext();

                if (prevNode != null) {
                    prevNode.setNext(nextNode);
                }

                if (nextNode != null) {
                    nextNode.setPrev(prevNode);
                }

                System.out.println(curr.getData() + " to be deleted.");
                size--;
            }
            curr = curr.getNext();
        }

    }

    public void deleteLast() {
        var newTail = last.getPrev();
        last = newTail;
        last.setNext(null);
        size--;
    }

    public void deleteMid() {
        System.out.println("size : " + size);
        curr = head;
        for (int i = 0; i < size / 2; i++) {
            curr = curr.getNext();
        }
        
        System.out.println("Deleting value " + curr.getData());
        
        var tv = curr.getPrev();
        var tn = curr.getNext();
        tv.setNext(tn);
        tn.setPrev(tv);

        size--;
    }

    public int     getSize() { return size; }
    public Node<T> getHead() { return head; }
    public Node<T> getCurr() { return curr; }
    public Node<T> getLast() { return last; }

    public static void main(String[] args) {
        DoublyLinkedList<Integer> l = new DoublyLinkedList<>();
        
        l.insertAtEnd(1);
        l.insertAtEnd(2);
        l.insertAtEnd(3);
        l.insertAtEnd(4);
        l.insertAtEnd(5);
        l.insertAtEnd(6);
        
        l.traverse(); // 1 2 3 4 5 6
        l.deleteMid();
        l.traverse(); // 1 2 3 5 6
        l.deleteMid();
        l.traverse(); // 1 2 5 6

        l.deleteLast();
        l.traverse(); // 1 2 5
    }
}