package org.example.service;

import org.example.stackinterface.IStack;

public class Stack <T> implements IStack <T>{
    private  Node<T>node;
    private int tamaño;

    public Stack() {
        this.tamaño =0;
    }
    @Override
    public boolean push(T t) {
        Node<T> nuevoNode = new Node<T>(t);
        nuevoNode.setNextNode(node);
        node = nuevoNode;
        tamaño++;
        return true;
    }



    @Override
    public T pop() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return node == null;
    }

    @Override
    public int size() {
        return tamaño;
    }

    @Override
    public T peek() {
        return null;
    }
}
