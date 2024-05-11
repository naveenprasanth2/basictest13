package org.example.linkedlist;

public class LinkedListExercise {
    public static class Node {
        int val;
        Node next = null;

        public Node(int val) {
            this.val = val;
        }
    }

    Node head = null;
    Node tail = null;


    private void addNodeAtEnd(int val) {
        Node newNode = new Node(val);
        if (head == null && tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void addAtBeginning(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = tail = newNode;
        } else {
            Node oldNode = head;
            head = newNode;
            newNode.next = oldNode;
        }
    }

    public void addAtGivenIndex(int index, int val) {
        Node node = head;
        Node newNode = new Node(val);
        int size = 0;
        while (node != null) {
            size++;
            node = node.next;
        }
        if (size < index || index < 0)
            throw new IndexOutOfBoundsException(STR."The available index is \{size}");
        node = head;
        int count = 0;
        while (count < index - 1) {
            node = node.next;
            count++;
        }
        if(count == 0){
            newNode.next = head;
            head = newNode;
        }else {
            newNode.next = node.next;
            node.next = newNode;
        }
    }

    public static void main() {
        LinkedListExercise linked = new LinkedListExercise();
        linked.addNodeAtEnd(10);
        linked.addNodeAtEnd(5);
        linked.addNodeAtEnd(4);
        linked.addNodeAtEnd(14);
        linked.addAtBeginning(20);
        linked.addAtGivenIndex(3, 7);
        linked.addAtGivenIndex(0, 7);
        linked.addAtGivenIndex(20, 5);
        Node node = linked.head;

        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

}
