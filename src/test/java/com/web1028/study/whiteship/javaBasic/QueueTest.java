package com.web1028.study.whiteship.javaBasic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void QueueTest(){
        QueueTemp q = new QueueTemp();
        q.enqueue(5);
        assertEquals(5,q.peek());
        q.enqueue(4);
        assertEquals(5,q.peek());
        q.enqueue(3);
        assertEquals(5,q.dequeue());
        assertEquals(4,q.dequeue());
    }
}