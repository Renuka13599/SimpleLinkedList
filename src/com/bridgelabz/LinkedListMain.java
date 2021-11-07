package com.bridgelabz;

public class LinkedListMain {
    public static void main(String[] args) {
    LinkedList list = new LinkedList();
        list.append(56);
        list.append(30);
        list.append(70);
        list.popLast();
        list.print();
        System.out.println("\n Index number : " + list.search(56));


   }
}
