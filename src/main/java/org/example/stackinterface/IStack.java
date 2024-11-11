package org.example.stackinterface;

public interface IStack <T> {
    public void push(T tipo);
    public T pop();
    public boolean isEmpty();
    public int size();
    public T peek();
}
