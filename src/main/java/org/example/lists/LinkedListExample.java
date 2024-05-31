package org.example.lists;


import org.checkerframework.checker.units.qual.N;

class Node {
    int val;
    Node next = null;

    Node(int val) {
        this.val = val;
    }
}

public class LinkedListExample {
    Node head = null;
    Node tail = null;


    private void addNodeAtEnd(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    private void addNodeAtBeginning(int val) {
        Node newNode = new Node(val);
        if (head == null && tail == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }


    public static void main(String[] args) {
        LinkedListExample linkedListExample = new LinkedListExample();
        linkedListExample.addNodeAtEnd(10);
        linkedListExample.addNodeAtEnd(20);
        linkedListExample.addNodeAtBeginning(1);
        linkedListExample.addNodeAtBeginning(2);
        Node node = linkedListExample.head;
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}
