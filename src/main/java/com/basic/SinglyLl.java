package com.basic;

import java.sql.SQLOutput;

public class SinglyLl {
    //REPRESENT A NODE OF THE SINGLY LINKED LIST//
    class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;

        }
    }
    //REPRESENT THE HEAD AND TAIL OF THE SINGLY LINKED LIST//
    public Node head =null;
    public Node tail = null;
    public void addNode(int data){
        //CREATE A NEW NODE//
        Node newNode = new Node(data);
        //CHECK IF THE LIST IS EMPTY//
        if (head == null){
            //IF LIST IS EMPTY BOTH HEAD AND TAIL WILL POINT TO THE NEW NODE//
            head = newNode;
            tail = newNode;

        }
        else {
            //NEW NODE WILL BE ADDED AFTER THE TAIL//
            tail.next =newNode;
            //newNode will become new tail of the list //
            tail = newNode;
        }
    }
    //DISPLAY() WILL DISPLAY ALL THE NODES PRESENT IN THE LIST//
    public void display(){
        //NODE CURRENT WILL POINT TO HEAD//
        Node current = head;
        if (head==null){
            System.out.println("List is Empty");
            return;
        }
        System.out.println("Nodes of Singly Linked List :");
        while (current != null) {
            //PRINT EACH NODE BY INCREMENTING POINTER //
            System.out.println(current.data + " ");
            current = current.next;

        }
        System.out.println();
    }
}
