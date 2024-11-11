package org.example.stackinterface;

public interface IStack <T> {
    public boolean push(T t);
    public T pop();
    public boolean isEmpty();
    public int size();
    public T peek();
}
