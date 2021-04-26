package com.web1028.study.whiteship.javaBasic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayStackTest {

    @Test
    void push() {
        ArrayStack as = new ArrayStack(3);
        as.push(1);
        as.push(2);
        as.push(3);
        assertThrows(ArrayIndexOutOfBoundsException.class,()->{
            as.push(4);
        });
    }

    @Test
    void pop() {
        ArrayStack as = new ArrayStack(3);
        as.push(1);
        as.push(2);
        assertEquals(2,as.pop());
        assertEquals(1,as.peek());;
    }

    @Test
    void peek() {
        ArrayStack as = new ArrayStack(3);
        as.push(1);
        assertEquals(1,as.peek());
        as.push(2);
        assertEquals(2,as.peek());
        as.push(3);
        assertEquals(3,as.peek());
    }

    @Test
    void isEmpty() {
        ArrayStack as = new ArrayStack(3);
        assertEquals(true ,as.isEmpty());
        as.push(1);
        assertEquals(false ,as.isEmpty());
    }

    @Test
    void isFull() {
        ArrayStack as = new ArrayStack(3);
        assertEquals(false, as.isFull());
        as.push(1);
        as.push(2);
        as.push(3);
        assertEquals(true, as.isFull());
    }
}