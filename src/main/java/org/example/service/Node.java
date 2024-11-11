package org.example.service;

public class Node <E>{
    private E data;
    private Node<E> nextNode;

    public Node(E data) {
        this.data = data;
        this.nextNode = null;
    }

    public Node<E> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<E> nextNode) {
        this.nextNode = nextNode;
    }

    public E getData() {
        return data;
    }


}
