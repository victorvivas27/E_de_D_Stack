package org.example.service;

public class Node <T>{
    private T data;
    private Node<T> nextNode;

    public Node(T data) {
        this.data = data;
        this.nextNode = null;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public T getData() {
        return data;
    }


}
