package org.example.linkedlist;

public class LinkedList {

    Node head;
    Node tail;
    int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    LinkedList(int value) {
        head = tail = new Node(value);
        length++;
    }

    private void append(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList(5);
        list.append(10);
        list.append(15);
        list.getHead();
        list.getTail();
        list.getLength();
        list.printList();
    }


    private void getHead() {
        System.out.println(STR."The head is \{head.value}");
    }

    private void getTail() {
        System.out.println(STR."The tail is \{tail.value}");
    }

    private void getLength() {
        System.out.println(STR."The length is \{length}");
    }

    private void printList() {
        Node temp = head;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

}
