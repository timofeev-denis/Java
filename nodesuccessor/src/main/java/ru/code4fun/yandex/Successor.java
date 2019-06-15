package ru.code4fun.yandex;

public class Successor {

    public Node inorderSuccessor(Node node) {

        if (node.getRight() == null) {
            return findInorderParent(node);
        } else {
            return findLeftMost(node.getRight());
        }
    }

    private Node findLeftMost(Node node) {
        Node left = node;
        while (node.getLeft() != null) {
            left = node.getLeft();
        }
        return left;
    }

    private Node findInorderParent(Node node) {
        Node parent = node.getParent();
        if (parent.getRight().equals(node)) {
            return findInorderParent(parent);
        } else {
            return parent;
        }
    }
}
