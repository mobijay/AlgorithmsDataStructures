package BinarySearchTree;

/**
 * Created by jmobijoh on 10/30/17.
 */
public class BinarySearchTree {

    Node rootNode = null;
    private static BinarySearchTree uniqueInstance;

    private BinarySearchTree(int data) {
        rootNode = new Node(data);
    }

    public static BinarySearchTree getInstance(int data) {
        if(uniqueInstance == null) {
            return new BinarySearchTree(data);
        }
        return uniqueInstance;
    }

    public void insert(Node nodeToAdd) {
        Node currentNode = rootNode;
        if(nodeToAdd == null) {
            return;
        }

        currentNode = recursiveNode(nodeToAdd, currentNode);
        if(currentNode != null) {
            if (nodeToAdd.getData() < currentNode.getData()) {
                currentNode.setLeft(nodeToAdd);
            } else {
                currentNode.setRight(nodeToAdd);
            }
        }
    }

    private Node recursiveNode(Node nodeToAdd, Node currentNode) {

        if(nodeToAdd.getData() < currentNode.getData()) {
            if(currentNode.getLeft() == null) {
                //currentNode.setLeft(nodeToAdd);
                return currentNode;
            } else {
                Node nextNode = currentNode.getLeft();
                recursiveNode(nodeToAdd, nextNode);
            }
        }

        if(nodeToAdd.getData() > currentNode.getData()) {
            if(currentNode.getRight() == null) {
                //currentNode.setRight(nodeToAdd);
                return currentNode;
            } else {
                Node nextNode = currentNode.getRight();
                recursiveNode(nodeToAdd, nextNode);
            }
        }
        return null;
    }

    public void inorderTraversal(Node currentNode) {
        if(currentNode.getLeft() != null) {
            inorderTraversal(currentNode.getLeft());
        }
        System.out.println(currentNode.getData());
        if(currentNode.getRight() != null) {
            inorderTraversal(currentNode.getRight());
        }
    }

    public void preOrderTraversal(Node currentNode) {
        System.out.println(currentNode.getData());
        if(currentNode.getLeft() != null) {
            inorderTraversal(currentNode.getLeft());
        }
        if(currentNode.getRight() != null) {
            inorderTraversal(currentNode.getRight());
        }
    }

    public void postOrderTraversal(Node currentNode) {
        if(currentNode.getLeft() != null) {
            inorderTraversal(currentNode.getLeft());
        }
        if(currentNode.getRight() != null) {
            inorderTraversal(currentNode.getRight());
        }
        System.out.println(currentNode.getData());
    }

    public Node getRootNode() {
        return rootNode;
    }
}
