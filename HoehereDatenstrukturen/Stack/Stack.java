import java.util.NoSuchElementException;
import java.util.ArrayList;

public class Stack<T> {
    private ArrayList<T> arr;
    private int top;

    public Stack() {
        arr = new ArrayList<T>();
        top = -1; 
    }

    public void push(T el) {
        arr.add(el);
        top++;
    }

    public void pop() {
        top--;
        // Eigentlich braucht man die "top" Variable nicht speichern,
        // da die Sachen wirklich auch gelöscht werden und das Array nicht nur durch "top" eingeengt wird.
        arr.remove(arr.size() - 1);
    }

    public void print() {
        final int sz = arr.size() - 1;
        if (sz < 0) {
            System.out.println("Stack ist leer.");
        }

        for (int i = sz; i >= 0; i--) {
            System.out.println(arr.get(i));
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack();
        s.push(2);
        s.push(3);
        s.push(4);
        s.print(); // 4 3 2
   
        s.pop();
        s.print(); // 3 2

        s.pop();
        s.pop();
        s.print(); // Stack ist leer.
    }
}