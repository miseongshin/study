package com.web1028.study.whiteship.javaBasic;

import java.util.List;
import java.util.NoSuchElementException;

interface QueueI<T>{
    boolean isEmpty();
    void enqueue(T data);
    T dequeue();
    T peek();
}

class Node<T>{
    List list ;
    private T data;
    private Node<T> next;
    public Node(T data){
        this.data=data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}


public class QueueTemp<T> implements QueueI {
    private Node<T> head;
    private Node<T> tail;

    @Override
    public boolean isEmpty() {
        return this.head ==null;
    }

    @Override
    public void enqueue(Object data) {
        Node<T> newNode = new Node<T>((T)data);
        if (this.tail != null) {
            this.tail.setNext(newNode);
        }
        tail = newNode;
        if (isEmpty()){
            head = tail;
        }
    }

    @Override
    public T dequeue() {
        if (isEmpty())
            throw new NoSuchElementException();

        T data = head.getData();
        this.head = head.getNext();

        if (head == null){
            tail = null;
        }
        return data;
    }

    @Override
    public T peek() {
        if (isEmpty()){
            throw new NoSuchElementException();
        }

        return head.getData();
    }
}

