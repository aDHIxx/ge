package com.bridgelabz.datastructures;

import java.util.Scanner;

public class Queue {

    private Node head;

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void enqueue(int data) {
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

    public void dequeue() {
        if (head == null) {
            System.out.println("Queue Empty.");
            return;
        }

        head = head.next;
    }

    // Method to display the contents of the queue
    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue Empty.");
            return;
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Method to peek at the front element of the queue
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue Empty");
        }
        return head.data;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue queue = new Queue();

        char choice;
        do {
            System.out.print("1.Enqueue ");
            System.out.print("2.Dequeue ");
            System.out.print("3.Peek ");
            System.out.print("4.Display ");
            System.out.println("5.Exit");

            System.out.print("Choice: ");
            int ch = scanner.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Ele: ");
                    int elementToEnqueue = scanner.nextInt();
                    queue.enqueue(elementToEnqueue);
                    break;

                case 2:
                    try {
                        queue.dequeue();
                    } catch (IllegalStateException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 3:
                    try {
                        int frontElement = queue.peek();
                        System.out.println(frontElement);
                    } catch (IllegalStateException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 4:
                    queue.displayQueue();
                    break;

                case 5:
                    System.out.println("Exiting program.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

            System.out.print("Continue? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y');

        scanner.close();
    }
}
