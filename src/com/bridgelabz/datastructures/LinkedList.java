package com.bridgelabz.datastructures;

import java.util.Scanner;



public class LinkedList {
    private Node head;
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to traverse the linked list and print elements
    public void traverse() {
        Node curr = head;
        System.out.print("Linked List: ");
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    // Method to insert a node at the start of the linked list
    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Method to insert a node at a specified pos in the linked list
    public void insertAtPosition(int data, int pos) {
        Node newNode = new Node(data);

        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node curr= head;
        for (int i = 0; i < pos - 1 && curr != null; i++) {
            curr = curr.next;
        }

        if (curr == null) {
            System.out.println("pos <= len(list)");
            return;
        }

        newNode.next = curr.next;
        curr.next = newNode;
    }

    // Method to insert a node at the end of the linked list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;
    }

    // Method to delete a node at the start of the linked list
    public void deleteAtStart() {
        if (head == null) {
            System.out.println("Empty.");
            return;
        }

        head = head.next;
    }

    // Method to delete a node at a specified pos in the linked list
    public void deleteAtPosition(int pos) {
        if (pos < 0 || head == null) {
            System.out.println("Empty.");
            return;
        }

        if (pos == 0) {
            head = head.next;
            return;
        }

        Node curr = head;
        Node prev = null;

        for (int i = 0; i < pos && curr != null; i++) {
            prev = curr;
            curr= curr.next;
        }

        if (curr == null) {
            System.out.println("pos <= len(list)");
            return;
        }

        prev.next = curr.next;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();

        char choice;
        do {
            System.out.print("1.Insert at Start  ");
            System.out.print("2.Insert at Position  ");
            System.out.print("3.Insert at End  ");
            System.out.print("4.Delete at Start  ");
            System.out.print("5.Delete at Position  ");
            System.out.print("6.Traverse  ");
            System.out.println("7.Exit");

            System.out.print("Choice: ");
            int ch = scanner.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Data: ");
                    int dataAtStart = scanner.nextInt();
                    linkedList.insertAtStart(dataAtStart);
                    break;

                case 2:
                    System.out.print("Data: ");
                    int dataAtPosition = scanner.nextInt();
                    System.out.print("Pos: ");
                    int pos = scanner.nextInt();
                    linkedList.insertAtPosition(dataAtPosition, pos);
                    break;

                case 3:
                    System.out.print("Data: ");
                    int dataAtEnd = scanner.nextInt();
                    linkedList.insertAtEnd(dataAtEnd);
                    break;

                case 4:
                    linkedList.deleteAtStart();
                    break;

                case 5:
                    System.out.print("Pos: ");
                    int positionToDelete = scanner.nextInt();
                    linkedList.deleteAtPosition(positionToDelete);
                    break;

                case 6:
                    linkedList.traverse();
                    break;

                case 7:
                    System.out.println("Exiting program.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid.");
            }

            System.out.print("Continue? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        scanner.close();
    }
}
