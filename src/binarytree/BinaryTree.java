
package binarytree;

public class BinaryTree {
    
    private class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    Node root;
    
    public BinaryTree() {
        this.root = null;
    }

    
    /*********** CreateTree Method ***********/
    public void createBTree() {
        // Level 0
        this.root = new Node(1);

        // Level 1
        this.root.left = new Node(2);
        this.root.right = new Node(3);

        // Level 2
        this.root.left.left = new Node(4);
        this.root.left.right = new Node(5);
        this.root.right.left = new Node(6);
        this.root.right.right = new Node(7);

        // Level 3
        this.root.left.left.left = new Node(8);
        this.root.left.left.right = new Node(9);
        this.root.left.right.left = new Node(10);
        this.root.left.right.right = new Node(11);
        this.root.right.left.left = new Node(12);
        this.root.right.left.right = new Node(13);
        this.root.right.right.left = new Node(14);
        this.root.right.right.right = new Node(15);
    }
    /*********** CreateTree Method ***********/
    
    
    /*********** Delete Method ***********/
    public void delete(int data) {
        root = deleteNode(root, data);
    }

    private Node deleteNode(Node node, int data) {
        if (node == null) {
            return null;
        }
        if (node.data == data) {
            if (node.left == null && node.right == null) {
                return null;
            } else if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            } else {
                Node replacement = findReplacement(node.right);
                node.data = replacement.data;
                node.right = deleteNode(node.right, replacement.data);
                return node;
            }
        } else if (data < node.data) {
            node.left = deleteNode(node.left, data);
        } else {
            node.right = deleteNode(node.right, data);
        }
        return node;
    }

    private Node findReplacement(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    /*********** Delete Method ***********/

    /*********** Search Method ***********/

    
    public boolean search(int data) {
        return searchNode(root, data);
    }
    private boolean searchNode(Node node, int data) {
        if (node == null) {
            return false;
        }
        if (node.data == data) {
            return true;
        }
        boolean foundInLeftSubtree = searchNode(node.left, data);
        boolean foundInRightSubtree = searchNode(node.right, data);
        return foundInLeftSubtree || foundInRightSubtree;
    }
    /*********** Search Method ***********/

    /*********** preOrder Method ***********/
    void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void printTreePreorder() {
        preOrder(root);
    }
    /*********** preOrder Method ***********/

    /*********** inOrder Method ***********/
    void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }
    
    public void printTreeInorder() {
        inorderTraversal(root);
    }
    /*********** inOrder Method ***********/

    /*********** postOrder Method ***********/
    void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }
    
    public void printTreePostorder() {
        postOrder(root);
    }
    /*********** postOrder Method ***********/

    /*********** inorderTraversal Method ***********/
    private void inorderTraversal(Node node) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left);
        System.out.print(node.data + " ");
        inorderTraversal(node.right);
    }
    /*********** inorderTraversal Method ***********/

}
