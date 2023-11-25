package BinaryTree;

import BankSystem.Client;

import java.util.Comparator;

public class Tree implements Comparator<Client> {
    public Node rootNode;

    public Tree() {
        rootNode = null;
    }

    public Client findNodeByValue(Client client) {
        Node currentNode = rootNode;
        if(currentNode == null) return null;
        while (compare(currentNode.getValue(), client) != 0) {
            if (compare(currentNode.getValue(), client) < 0) {
                currentNode = currentNode.getRightChild();
            } else if (compare(currentNode.getValue(), client) > 0) {
                currentNode = currentNode.getLeftChild();
            }
            if (currentNode == null) {
                return null;
            }
        }
        return currentNode.getValue();
    }

    public void insertNode(Client client) {
        Node newNode = new Node();
        newNode.setValue(client);
        if (rootNode == null) {
            rootNode = newNode;
        } else {
            Node currentNode = rootNode;
            Node parentNode;
            while (true) {
                parentNode = currentNode;
                if (compare(client, currentNode.getValue()) == 0) {
                    return;
                } else if (compare(client, currentNode.getValue()) > 0) {
                    currentNode = currentNode.getLeftChild();
                    if (currentNode == null) {
                        parentNode.setLeftChild(newNode);
                        return;
                    }
                } else {
                    currentNode = currentNode.getRightChild();
                    if (currentNode == null) {
                        parentNode.setRightChild(newNode);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public int compare(Client cl1, Client cl2) {
        return cl1.compareTo(cl2);
    }
}
