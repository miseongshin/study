package com.web1028.study.whiteship.javaBasic;

public class NodeStack implements Stack{
    private ListNode head;

    @Override
    public void push(int data) {
        ListNode newNode = new ListNode(data);
        if (!this.isEmpty()) {
            newNode.setNext(this.head);
        }
        this.head = newNode;
    }

    @Override
    public int pop() {
        ListNode returnNode = this.head;
        this.head = returnNode.getNext();
        return returnNode.getData();
    }

    @Override
    public int peek() {
        return this.head.getData();
    }

    @Override
    public boolean isEmpty() {
        if (this.head ==null)
            return true;
        return false;
    }
}

