public class Node<T> {
    private T    data;
    private Node prev;
    private Node next;
    
    public Node() {
        data = null;
        prev = null;
        next = null;
    }

    public Node(T data) {
        this.data   = data;
        prev        = null;
        next        = null;
    }

    public Node(T data, Node p, Node n) {
        this.data   = data;
        prev        = p;
        next        = n;
    }

    // setters
    public void setData(T data)     { this.data = data; }
    public void setPrev(Node<T> p)  { prev = p; }
    public void setNext(Node<T> n)  { next = n; }

    // getters
    public T getData()          { return data; }
    public Node<T> getPrev()    { return prev; }
    public Node<T> getNext()    { return next; }
}