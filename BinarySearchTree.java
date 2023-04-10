public class BinarySearchTree {

    private Node root;

    private static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public BinarySearchTree() {
        root = null;
        insert(35);
        insert(18);
        insert(48);
        insert(72);
        insert(60);
        insert(25);
    }

    public void insert(int data) {
        root = insert(root, data);
    }

    private Node insert(Node node, int data) {
        if (node == null) {
            node = new Node(data);
        } else if (data < node.data) {
            node.left = insert(node.left, data);
        } else if (data > node.data) {
            node.right = insert(node.right, data);
        }
        return node;
    }

    public boolean contains(int data) {
        return contains(root, data);
    }

    private boolean contains(Node node, int data) {
        if (node == null) {
            return false;
        } else if (data == node.data) {
            return true;
        } else if (data < node.data) {
            return contains(node.left, data);
        } else {
            return contains(node.right, data);
        }
    }
}