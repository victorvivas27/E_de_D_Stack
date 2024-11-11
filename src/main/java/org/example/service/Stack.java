package org.example.service;

import org.example.stackinterface.IStack;

public class Stack <T> implements IStack {
    private  Node<T>node;
    private int tamaño;

    public Stack() {
        this.tamaño =0;
    }

    @Override
    public void push(Object tipo) {

    }

    @Override
    public Object pop() {
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
    public Object peek() {
        return null;
    }
}
