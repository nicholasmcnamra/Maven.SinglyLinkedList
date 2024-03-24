package com.zipcodewilmington.singlylinkedlist;
import org.junit.Test;
import org.junit.Assert;
/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void linkedListAddTest() {
        SinglyLinkedList list  = new SinglyLinkedList<>();

        list.add(1);
        list.add(2);
        boolean assertListContains = list.isEmpty();
        Assert.assertFalse(assertListContains);
    }

    @Test
    public void linkedListRemoveTest() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(1);
        list.add(2);
        list.add("pizzaz");
        list.add("hotdog");

        int expectedListSize = 3;
        list.remove("pizzaz");
        int actualListSize = list.size();

        Assert.assertEquals(expectedListSize, actualListSize);
    }

}
