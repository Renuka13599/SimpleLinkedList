package com.bridgelabz;
/*Author:Renu
*Date:7/11/21
*purpose:To create a linked list in sort  last to first element
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
        MyNode temp = head;                      //traversing through the list
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
    }

}
