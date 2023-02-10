package com.basic;

public class DoubleLl {
    //CREATE A NODE FOR DOUBLY LL//
    class Node {
        String data;
        Node prev;
        Node next;
        public Node(String data){
            this.data = data ;

        }
    }
    // INITIALIZE HEAD AND TAIL FOR THE DOUBLY LINKED LIST//
    Node head = null;
    Node tail= null;
    public void addNewNode (String data){
        //CREATE NODE//
        Node newNode = new Node(data);
        //CHECK WHETHER THE DOUBLY LL IS EMPTY OR NOT //
        if(head == null){
            // THE NEW NODE IS POINTED BY BOTH HEAD AND TAIL//
            head = newNode;
            tail = newNode;
            //IT IS FIRST NODE SO PREV WILL POINT TO NULL//
            //SO LAST NODE NEXT WILL ALSO POINT TOT NULL //
            head.prev = null;
            tail.next = null;
            //EXECUTE WHEN THE DOUBLY LL IS NOT EMPTY//
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;

        }
    }
    public void showData(){
        Node current = head ;
        if (head == null){
            System.out.println("list is empty");
            return;
        }
        System.out.println(" nodes of dll are ");
        //ITERATE THE DLL USING WHILE//
        while(current!= null){
            System.out.print(current.data+"\n");
            current = current.next;

        }
    }

}
