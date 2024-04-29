package org.example.linkedlist;

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }
}

public class LinkedListEval {
    Node head = null;
    Node tail = null;

    void addNodeAtEnd(int val) {
        Node newNode = new Node(val);
        if (head == null && tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void reverseLinkedList() {
        Node node = head;

        while (node.next != null){
            Node second = node.next;
            Node third = second.next;
            node.next = null;
            second.next = node;
            third.next = second;
            node = third;
        }
    }

    public static void main() {
        LinkedListEval linkedListEval = new LinkedListEval();
        linkedListEval.addNodeAtEnd(15);
        linkedListEval.addNodeAtEnd(20);
        linkedListEval.addNodeAtEnd(25);
        linkedListEval.addNodeAtEnd(30);
        linkedListEval.addNodeAtEnd(35);
        linkedListEval.reverseLinkedList();

        Node node = linkedListEval.head;

        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }
}
