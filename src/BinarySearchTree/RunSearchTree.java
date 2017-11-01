package BinarySearchTree;

/**
 * Created by jmobijoh on 10/30/17.
 */
public class RunSearchTree {

    public static void main(String[] args) {
        BinarySearchTree bst = BinarySearchTree.getInstance(6);

        Node nodeToAdd = new Node(4);
        Node nodeToAdd2 = new Node(7);
        Node nodeToAdd3 = new Node(3);
        bst.insert(nodeToAdd);
        bst.insert(nodeToAdd2);
        bst.insert(nodeToAdd3);
        bst.inorderTraversal(bst.getRootNode());
    }
}
