package com.zipcodewilmington.singlylinkedlist;
import java.util.Iterator;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> implements Iterable {

    public class Node {
        T data;
        Node next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node first;
    private Node last;
    private int N;


    public SinglyLinkedList() {
        first = null;
        last = null;
        N = 0;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void add(T item) {
        if (item == null) {throw new NullPointerException();}
        if (!isEmpty()) {
            Node previous = last;
            last = new Node(item, null);
            previous.next = last;
        }
        else {
            last = new Node(item, null);
            first = last;
        }
        N++;
    }

    public boolean remove(T item) {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty. Nothing to remove.");
        }
        boolean result = false;
        Node current = first;
        Node previous = first;
        try {
            while (current.next != null || current == last) {
                if (current.data.equals(item)) {
                    if (N == 1) {
                        first = null;
                        last = null;
                    }
                    //remove 1st element
                    else if (current.equals(first)) {
                        first = first.next;
                    }
                    //remove last
                    else if (current.equals(last)) {
                        previous = last;
                        last.next = null;
                    }
                    //look for element and remove it
                    else {
                        previous.next = current.next;
                    }
                    N--;
                    result = true;
                }
                previous = current;
                current = previous.next;
            }
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught");
        }
        return result;
    }

    public boolean contains(T item) {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty. Nothing to check.");
        }
        boolean result = false;
        Node current = first;
        while (current.next != null || current == last) {
            if (current.data.equals(item)) {
                result = true;
                break;
            }
            else {
                current = current.next;
            }
        }
        return result;
    }

    public int find(T item) {
        int result = -1;
        Node current = first;
        while (current.next != null || current == last) {
            if (current.data.equals(item)) {
                result++;
                break;
            } else {
                result++;
                current = current.next;
            }
        }
        return result;
    }

    public T get(int index) {
        T result = null;
        Node current = first;
        for (int i = 0; i < N; i++) {
            if (i == index) {
                result = current.data;
            } else {
                current = current.next;
            }
        }
        return result;
    }

    public SinglyLinkedList<T> copy() {
        SinglyLinkedList<T> newList  = new SinglyLinkedList<>();

        Node current = first;
        while (current != null || current == last) {
            newList.add(current.data);
            current = current.next;
        }

        return newList;
    }


    

    @Override
    public Iterator iterator() {
        return null;
    }
}