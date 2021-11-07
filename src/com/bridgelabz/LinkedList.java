package com.bridgelabz;
/*Author:Renu
*Date:7/11/21
*purpose:Insert an element in Linkedlist
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
    public void insertAt(int data) {
        MyNode newNode = new MyNode(data);
        newNode.next = head;
        head = newNode;
    }


        public void append(int data) {
        MyNode newNode = new MyNode(data);
        if (head == null){
            head = newNode;
            head.next = null;
        }
        else {
            MyNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            temp = newNode;
        }


    }

    public void insertAt(int data, int index) {
        MyNode newNode = new MyNode(data);
        MyNode temp = head;
        for (int i=0;i < index - 1;i++){             //traversing to that Index
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }



}

    class MyNode{
        int data;                            //declaring variables
        MyNode next;
        MyNode(int data){
            this.data = data;
            next = null;
        }


    void print(){
        MyNode temp = head;                      //traversing through the list
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
    }

}
