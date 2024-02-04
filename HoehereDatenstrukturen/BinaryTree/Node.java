public class Node {
    private int data;
    private Node left;
    private Node right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    public Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setL(Node left) {
        this.left = left;
    }

    public void setR(Node right) {
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public Node getL() {
        return left;
    }

    public Node getR() {
        return right;
    }

}