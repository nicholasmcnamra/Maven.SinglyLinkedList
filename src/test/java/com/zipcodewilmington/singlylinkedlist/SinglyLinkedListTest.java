package com.zipcodewilmington.singlylinkedlist;
import org.junit.AfterClass;
import org.junit.Before;
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

    @Test
    public void linkedListContains() {
        SinglyLinkedList list = new SinglyLinkedList();

        list.add(1);
        list.add(2);
        list.add(5);

        boolean actualItemInLinkedList = list.contains(5);
        Assert.assertTrue(actualItemInLinkedList);
    }

    @Test
    public void linkedListFindTest() {
        SinglyLinkedList list = new SinglyLinkedList();

        list.add(1);
        list.add(2);
        list.add(3);

        int expectedIndexInLinkedList = 2;
        int actualIndexInLinkedList = list.find(3);

        Assert.assertEquals(expectedIndexInLinkedList, actualIndexInLinkedList);
    }

    @Test
    public void linkedListGetTest() {
        SinglyLinkedList list = new SinglyLinkedList();

        list.add(1);
        list.add(2);
        list.add(3);

        Object expectedItemAtIndexOfLinkedList = 3;
        Object actualItemAtIndexOfLinkedList = list.get(2);

        Assert.assertEquals(expectedItemAtIndexOfLinkedList, actualItemAtIndexOfLinkedList);
    }

    @Test
    public void linkedListCopyTest() {
        SinglyLinkedList list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);


        Object expectedSizeOfLinkedList = 3;
        Object actualSizeOfLinkedList = list.copy().size();

        Assert.assertEquals(expectedSizeOfLinkedList, actualSizeOfLinkedList);
    }

    @Test
    public void linkedListBubbleSortTest() {
        SinglyLinkedList list = new SinglyLinkedList();

        list.add(3);
        list.add(2);
        list.add(1);

        list.intSort();
        Object expectedValueAtIndex = 1;
        Object actualValueAtIndex = list.get(0);

        Assert.assertEquals(expectedValueAtIndex, actualValueAtIndex);
    }
}
