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

    private Node get(int index) {
        int count = 0;
        if (index == 0) return head;
        Node current = head;

        while (count != index) {
            current = current.next;
            if (current == null) {
                throw new IndexOutOfBoundsException(STR."Please enter a  value between 0 and \{count}");
            }
            count++;
        }

        return current;
    }

    public boolean insert(int index, int value) {
        Node newNode = new Node(value);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            length++;
            return true;
        }

        Node current = head;
        int count = 0;

        while (count < index - 1) {
            current = current.next;
            if (current == null) {
                throw new IndexOutOfBoundsException(STR."Please enter a  value between 0 and \{count}");
            }
            count++;
        }
        Node temp = current.next;
        current.next = newNode;
        newNode.next = temp;
        length++;
        return true;
    }

    private boolean set(int index, int value) {
        int count = 0;
        if (index == 0) {
            head.value = tail.value = value;
            return true;
        }
        Node current = head;
        while (count < index ) {
            current = current.next;
            count++;
            if(current == null){
                throw new IndexOutOfBoundsException(STR."Please enter a  value between 0 and \{count}");
            }
        }
        current.value = value;
        return true;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList(5);
        list.append(10);
        list.append(15);
        list.append(25);
        list.prepend(99);
        System.out.println(list.insert(1, 100));
        list.set(0, 66);
        list.set(2, 55);
//        list.set(10, 6);
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
