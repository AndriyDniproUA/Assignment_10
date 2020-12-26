package com.savytskyy.Assignment10;

public class Main {

    public static void main(String[] args) {
        TwoWayLinkedList<String> s = new TwoWayLinkedList<>();
        s.add("one");
        s.add("two");
        s.add("three");
        s.forEach(el -> System.out.println(el));
        System.out.println("*******************");
        s.forEachReverse(el -> System.out.println(el));

        System.out.println("*****************************");

        TwoWayLinkedList<Integer> i = new TwoWayLinkedList<>();
        i.add(1);
        i.add(2);
        i.add(3);
        i.forEach(el -> System.out.println(el));
        System.out.println("*******************");
        i.forEachReverse(el -> System.out.println(el));

    }
}
