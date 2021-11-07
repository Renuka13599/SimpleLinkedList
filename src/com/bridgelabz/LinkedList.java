package com.bridgelabz;
/*Author:Renu
*Date:7/11/21
*purpose:Simple linked list
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

    /**
     * MyNode is to create the node with data
     */
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

    /**
     * print method is to print the list
     */
    void print(){
        MyNode temp = head;                      //traversing through the list
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
    }

}
