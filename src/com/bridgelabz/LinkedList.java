package com.bridgelabz;
/*Author:Renu
*Date:7/11/21
*purpose:Using Append method to create a linked list
 */

public class LinkedList {
    MyNode head,tail;

    public void add(int data) {
        MyNode newNode = new MyNode(data);
        if (head == null){                       //when list is empty head will be null add new node
            head = tail = newNode;
        }
        else {
            tail.next = newNode;                 //when list is not empty adds new node to the next node
            tail = newNode;
        }
    }

    public void append(int data) {
        MyNode newNode = new MyNode(data);
        if (head == null){
            head = newNode;
            head.next = null;
        }
        else {
            MyNode temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            temp = newNode;
        }

    }

 
    class MyNode{
        int data;                            //declaring variables
        MyNode next;
        /**
         * Parameterised constructor to create a new node
         * Defined data and next
         */
        MyNode(int data){
            this.data = data;
            next = null;
        }
    }


    void print(){
        MyNode temp = head;                      
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
    }

}
