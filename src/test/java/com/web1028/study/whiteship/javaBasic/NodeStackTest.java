package com.web1028.study.whiteship.javaBasic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeStackTest {

    @Test
    void push() {
        NodeStack as = new NodeStack();
        as.push(1);
        as.push(2);
        as.push(3);

    }

    @Test
    void pop() {
        NodeStack as = new NodeStack();
        as.push(1);
        as.push(2);
        assertEquals(2,as.pop());
        assertEquals(1,as.peek());;
    }

    @Test
    void peek() {
        NodeStack as = new NodeStack();
        as.push(1);
        assertEquals(1,as.peek());
        as.push(2);
        assertEquals(2,as.peek());
        as.push(3);
        assertEquals(3,as.peek());
    }

    @Test
    void isEmpty() {
        NodeStack as = new NodeStack();
        assertEquals(true ,as.isEmpty());
        as.push(1);
        assertEquals(false ,as.isEmpty());
    }
}