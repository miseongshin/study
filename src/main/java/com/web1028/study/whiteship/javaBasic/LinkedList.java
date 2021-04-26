package com.web1028.study.whiteship.javaBasic;


class ListNode {
    private int data;
    private ListNode next;

    public ListNode(int data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }
}

interface Linked_List{

    int length();
    void printAll();
    boolean isEmpty();

    void add(int value);
    void add(int value, int index);

    int get(int index);
    int delete(int index);
}


public class LinkedList implements Linked_List {
    private ListNode head;

    public LinkedList(int value) {
        this.head = new ListNode(value);
    }


    @Override
    public int length() {
        if (this.isEmpty())
            return 0;

        ListNode curNode = this.head;
        int length = 1;
        while (curNode.getNext() !=null){
            curNode = curNode.getNext();
            length++;
        }
        return length;
    }

    @Override
    public void printAll() {
        if (this.isEmpty()){
            System.out.println("Empty!!");
            return;
        }

        ListNode curNode = this.head;
        String printText = String.valueOf(curNode.getData());
        while (curNode.getNext() !=null){
            curNode = curNode.getNext();
            printText = printText.concat(", ").concat(String.valueOf(curNode.getData()));
        }

        System.out.println(printText);
    }

    @Override
    public boolean isEmpty() {
        if (this.head == null)
            return true;
        return false;
    }

    @Override
    public void add(int value) {
        if (isEmpty()){
            this.head = new ListNode(value);
            return;
        }

        ListNode curNode = this.head;
        while (curNode.getNext() !=null){
            curNode = curNode.getNext();
        }

        curNode.setNext(new ListNode(value));
    }

    @Override
    public void add(int value, int index) {
        if (isEmpty() && index !=0){
            throw new ArrayIndexOutOfBoundsException();
        }

        ListNode addNode = new ListNode(value);
        if (index == 0 ){
            addNode.setNext(this.head);
            this.head = addNode;
            return;
        }

        ListNode beforeAddNode = this.head;
        for (int i = 0; i < index-1; i++) {
            beforeAddNode = beforeAddNode.getNext();
        }
        addNode.setNext(beforeAddNode.getNext());
        beforeAddNode.setNext(addNode);
    }

    @Override
    public int get(int index) {
        if (isEmpty() && index != 0 ) {
            throw new ArrayIndexOutOfBoundsException("this linkedList is Empty");
        }
        if (index > this.length()){
            throw new ArrayIndexOutOfBoundsException();
        }

        ListNode curNode = this.head;
        for (int i = 0; i < index; i++) {
            curNode = curNode.getNext();
        }
        return curNode.getData();
    }

    @Override
    public int delete(int index) {

        if (isEmpty() && index != 0) {
            throw new ArrayIndexOutOfBoundsException("this list is Empty!!");
        }

        ListNode deleteNode = this.head;
        if (index == 0){
            this.head = deleteNode.getNext();
            return deleteNode.getData();
        }

        ListNode before_deleteNode = this.head;
        for (int i = 1; i < index - 1; i++) {
            before_deleteNode = before_deleteNode.getNext();
        }

        deleteNode = before_deleteNode.getNext();
        before_deleteNode.setNext(deleteNode.getNext());
        return deleteNode.getData();
    }
}

