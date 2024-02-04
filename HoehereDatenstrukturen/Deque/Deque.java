import java.util.LinkedList;

public class Deque<T> {
    private LinkedList<T> arr;

    public Deque() {
        arr = new LinkedList<>();
    }

    public void enqueueFirst(T el) {
        arr.add(0, el);
    }

    public void enqueueLast(T el) {
        arr.add(el);
    }

    public void dequeueFirst() {
        if (arr.size() > 0) {
            arr.remove(0);
        }
    }

    public void dequeueLast() {
        if (arr.size() > 0) {
            arr.remove(arr.size() - 1);
        }
    }

    public void print() {
        for (T el : arr) {
            System.out.println(el);
        }
    }

    public static void main(String[] args) {
        Deque<Integer> q = new Deque<>();
    
        q.enqueueLast(1);
        q.enqueueLast(2);
        q.enqueueLast(3);
        q.print(); // 1 2 3

        q.enqueueLast(10);
        q.enqueueFirst(20);
        q.enqueueLast(30);
        q.dequeueLast();

        q.print(); // 20 1 2 3 10
    }
}