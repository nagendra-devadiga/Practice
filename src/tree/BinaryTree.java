package tree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    Node root;

    private class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            right = null;
            left = null;
        }
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

    public static BinaryTree createBinaryTree() {
        BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

        return bt;
    }


    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }

    private boolean containsNodeRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        return value < current.value
                ? containsNodeRecursive(current.left, value)
                : containsNodeRecursive(current.right, value);
    }

    public void display() {
        System.out.println("\nIn-order:");
        displayRecursiveInOrder(root);
        System.out.println("\nPre-order:");
        displayRecursivePreOrder(root);
        System.out.println("\nPost-order:");
        displayRecursivePostOrder(root);
    }

    private void displayRecursivePostOrder(Node current) {
        if(current == null)
            return;
        displayRecursivePostOrder(current.left);
        displayRecursivePostOrder(current.right);
        System.out.print(" "+current.value);
    }

    private void displayRecursiveInOrder(Node current) {
        if(current == null)
            return;
        displayRecursiveInOrder(current.left);
        System.out.print(" "+current.value);
        displayRecursiveInOrder(current.right);
    }

    private void displayRecursivePreOrder(Node current) {
        if(current == null)
            return;
        System.out.print(" "+current.value);
        displayRecursivePreOrder(current.left);
        displayRecursivePreOrder(current.right);
    }

    public void delete(int value) {
        root = deleteRecursive(root, value);
    }


    private Node deleteRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }

        if (value == current.value) {
            // Node to delete found
            // ... code to delete the node will go here
            return null;

        } else if (value < current.value) {
            current.left = deleteRecursive(current.left, value);
        } else {
            current.right = deleteRecursive(current.right, value);
        }
        return current;
    }

    public void traverseLevelOrderBFS() {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {

            Node node = queue.remove();

            System.out.print(" " + node.value);

            if (node.left != null) {
                queue.add(node.left);
            }

            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

    public void traverseLevelOrderDFS() {
        if (root == null) {
            return;
        }

        Deque<Node> stack = new LinkedList<>();
        stack.push(root);

        while (!stack.isEmpty()) {

            Node node = stack.pop();

            System.out.print(" " + node.value);

            if (node.left != null)
                stack.add(node.left);


            if (node.right != null)
                stack.add(node.right);

        }
    }

    public static void main(String[] args) {
        BinaryTree bt = BinaryTree.createBinaryTree();
//
//        System.out.println("\nBefore delete");
//        bt.display();
//
//        bt.delete(8);
//
//        System.out.println("\nAfter delete node 8");
        bt.display();
        System.out.println("\nBFS");
        bt.traverseLevelOrderBFS();
        System.out.println("\nDFS");
        bt.traverseLevelOrderDFS();
    }


}
