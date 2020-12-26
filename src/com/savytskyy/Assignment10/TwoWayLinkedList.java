package com.savytskyy.Assignment10;

import java.util.function.Consumer;

public class TwoWayLinkedList<T> {
    private Node head;
    private Node tail;
    private int size = 0;

    public void add(T value) {
        Node n = new Node(value);
        if (head == null) {
            head = tail = n;
        } else {
            tail.next = n;
            n.previous = tail;
            tail = n;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        CheckIndex(index);
        Node cur = getNodeByIndex(index);
        return (T) cur.value;
    }

    public void set(int index, T value) {
        CheckIndex(index);
        Node cur = getNodeByIndex(index);
        cur.value = value;
    }

    private void CheckIndex(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
    }


    private Node getNodeByIndex(int index) {
        Node cur = head;
        for (int i = 0; i < index; i++) cur = cur.next;
        return cur;
    }

    public void forEach(Consumer<T> consumer) {
        for (Node cur = head; cur != null; cur = cur.next) {
            consumer.accept((T) cur.value);
        }
    }

    public void forEachReverse(Consumer<T> consumer) {
        for (Node cur = tail; cur != null; cur = cur.previous) {
            consumer.accept((T) cur.value);
        }
    }


    private class Node<T> {
        Object value;
        Node next;
        Node previous;

        public Node(T value) {
            this.value = value;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getPrevious() {
            return previous;
        }

        public void setPrevious(Node previous) {
            this.previous = previous;
        }
    }
}
