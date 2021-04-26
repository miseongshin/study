package com.web1028.study.whiteship.javaBasic;

//JUnit5
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@DisplayName("링크드 리스트")
class LinkedListTest {

    @Test
    void Linked_List_init_Test(){

        LinkedList ll = new LinkedList(4);
        assertEquals(false,ll.isEmpty() ,"LinkedList is Empty!!");
        ll.delete(0);
        assertEquals(true,ll.isEmpty() ,"LinkedList is Empty!!");
        ll.printAll();

    }

    @Test
    void test_add_get(){

        LinkedList ll = new LinkedList(4);
        assertEquals(1,ll.length() ,"fail to linkedList length check!!");
        ll.add(5);
        assertEquals(2,ll.length() ,"fail to linkedList length check!!");
        ll.add(0,0);
        ll.add(1,1);
        ll.add(2,2);
        ll.printAll();
        assertEquals(0,ll.get(0) ,"fail!!  unExpected Value");
        assertEquals(1,ll.get(1) ,"fail!!  unExpected Value");
        assertEquals(2,ll.get(2) ,"fail!!  unExpected Value");
        ll.printAll();
    }

    @Test
    void test_delete(){

        LinkedList ll = new LinkedList(4);
        ll.add(5);
        ll.add(0,0);
        ll.add(1,1);
        ll.add(2,2);
        assertEquals(0,ll.delete(0) ,"fail to linkedList delete check");
        ll.printAll();
        assertEquals(4,ll.delete(3) ,"fail to linkedList delete check");
        ll.printAll();
        assertThrows(ArrayIndexOutOfBoundsException.class,()->{
            LinkedList ll2 = new LinkedList(4);
            ll2.get(10);
        });

    }
}