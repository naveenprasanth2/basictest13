package org.example.linkedlist;

import java.util.Objects;

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

    private void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    private void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = tail = newNode;
            length++;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    private Node removeLast() {
        if (length == 0) throw new IndexOutOfBoundsException();
        Node temp = head;
        Node pre = head;
        if (length == 1) {
            head = tail = null;
            return temp;
        }
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }

        tail = pre;
        tail.next = null;
        length--;
        return temp;
    }

    private Node removeFirst() {
        Node temp = head;
        head = head.next;
        length--;
        return temp;
    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList(5);
        list.append(10);
        list.append(15);
        list.append(25);
        System.out.println(list.removeLast().value);
        System.out.println(STR."The removed value is \{list.removeFirst().value}");
        list.prepend(99);
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
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

}
