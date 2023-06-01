package binarytree;

public class BinaryTreeMain {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.createBTree();
        System.out.println("inOrder Tree:");
        tree.printTreeInorder();
        System.out.println();
        System.out.println("postOrder Tree:");
        tree.printTreePostorder();
        System.out.println();
        System.out.println("preOrder Tree:");
        tree.printTreePreorder();
        System.out.println();
        System.out.println("*** Delete ***");
        tree.delete(15);
        System.out.println("preOrder Tree:");
        tree.printTreePreorder();
        System.out.println();

        System.out.println("Found? " + tree.search(15));
    }
    
}
