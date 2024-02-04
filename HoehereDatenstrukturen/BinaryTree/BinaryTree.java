public class BinaryTree {
    private Node root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(int val) {
        root = new Node(val);
    }

    public boolean hasNextL(Node c) {
        return c.getL() != null;
    }

    public boolean hasNextR(Node c) {
        return c.getR() != null;
    }

    public void delete(int key) {
        root = deleteNode(root, key);
    }

    private Node deleteNode(Node root, int key) {
        if (root == null) {
            return root;
        }

        if (root.getData() > key) {
            root.setL(deleteNode(root.getL(), key));
            return root;
        } else if (root.getData() < key) {
            root.setR(deleteNode(root.getR(), key));
            return root;
        }

        if (root.getL() == null) {
            Node temp = root.getR();
            return temp;
        } else if (root.getR() == null) {
            Node temp = root.getL();
            return temp;
        }

        Node succParent = root;

        Node succ = root.getR();
        while (succ.getL() != null) {
            succParent = succ;
            succ = succ.getL();
        }

        if (succParent != root) {
            succParent.setL(succ.getR());
        } else {
            succParent.setR(succ.getR());
        }
        root.setData(succ.getData());

        return root;
    }

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.getData()) {
            current.setL(addRecursive(current.getL(), value));
        } else if (value > current.getData()) {
            current.setR(addRecursive(current.getR(), value));
        } else {
            return current;
        }

        return current;
    }

    public void insert(int val) {
        root = addRecursive(root, val);
    }

    private void preOrderTraversal(Node start) {
        if (start == null) return;

        System.out.println(start.getData());
        inOrderTraversal(start.getL());
        inOrderTraversal(start.getR());
    }

    private void inOrderTraversal(Node start) {
        if (start == null) return;

        inOrderTraversal(start.getL());
        System.out.println(start.getData());
        inOrderTraversal(start.getR());
    }

    private void postOrderTraversal(Node start) {
        if (start == null) return;

        inOrderTraversal(start.getL());
        inOrderTraversal(start.getR());
        System.out.println(start.getData());
    }

    public void preOrder() {
        preOrderTraversal(root);
    }

    public void inOrder() {
        inOrderTraversal(root);
    }

    public void postOrder() {
        postOrderTraversal(root);
    }

    public static void main(String[] args) {
        BinaryTree t = new BinaryTree(6);
        t.insert(4);
        t.insert(769);
    }
}