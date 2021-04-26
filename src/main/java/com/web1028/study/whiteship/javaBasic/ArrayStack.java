package com.web1028.study.whiteship.javaBasic;
interface Stack{
    void push(int data);
    int pop();
    int peek();
    boolean isEmpty();
}

public class ArrayStack implements Stack {

    private int top;
    private int stackSize;
    private int[] stackArr;

    public ArrayStack(int stackSize) {
        this.stackSize = stackSize;
        this.top = -1;
        this.stackArr = new int[this.stackSize];
    }

    @Override
    public void push(int data) {
        if (this.isFull()){
            throw new ArrayIndexOutOfBoundsException();
        }

        this.stackArr[++this.top] = data;
    }

    @Override
    public int pop() {
        if (this.isEmpty()){
            throw new ArrayIndexOutOfBoundsException("Deleting fail! Stack is empty!");
        }

        return this.stackArr[this.top--];
    }

    @Override
    public int peek() {
        if (this.isEmpty()){
            throw new ArrayIndexOutOfBoundsException("Deleting fail! Stack is empty!");
        }
        return this.stackArr[this.top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return this.top == this.stackSize-1;
    }
}
