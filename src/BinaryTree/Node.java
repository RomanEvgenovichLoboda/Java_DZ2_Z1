package BinaryTree;

import BankSystem.Client;

public class Node {
    private Client value;
    private Node leftChild;
    private Node rightChild;

    public Client getValue() {
        return value;
    }

    public void setValue(final Client client) {
        this.value = client;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(final Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(final Node rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", leftChild=" + leftChild +
                ", rightChild=" + rightChild +
                '}';
    }
}
