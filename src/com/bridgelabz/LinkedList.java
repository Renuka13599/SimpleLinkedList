package com.bridgelabz;
/*Author:Renu
*Date:7/11/21
*purpose:Search an element of
 */

public class LinkedList {
    MyNode head,tail;
    public void add(int data) {
        MyNode newNode = new MyNode(data);
        if (head == null) {                       //when list is empty head will be null add new node
            head = tail = newNode;
        } else {
            tail.next = newNode;                 //when list is not empty adds new node to the next node
            tail = newNode;
        }
    }
    public void insertAtStart(int data){
        MyNode newNode = new MyNode(data);
        newNode.next = head;
        head = newNode;
    }
    //Append method
    public void append(int data){
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

    /**
     * inserting the node
     * **/
    public void insertAt(int index,int data){
        MyNode newNode = new MyNode(data);
        MyNode temp = head;
        for (int i=0;i < index - 1;i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteFirstNode(){
        MyNode temp = head;
        head = temp.next;
    }

    public void pop() {
        MyNode temp = head;
        head = temp.next;
    }

    public void popLast(){
        MyNode temp = head;
        while ((temp.next).next != null){               //it will traverse upto last before node
            temp = temp.next;
        }
        temp.next = null;
    }

    public int search(int data){
        MyNode temp = head;
        int index = 0;                      //initialising the index
        while(temp != null){                   //traverse through the list
            if (temp.data == data) {
                return index;
            }
            index++;
            temp = temp.next;
        }
        return index;
    }

    class MyNode{
        int data;                            //declaring variables
        MyNode next;
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