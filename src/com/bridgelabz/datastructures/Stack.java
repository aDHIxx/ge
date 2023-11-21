package com.bridgelabz.datastructures;

import java.util.Scanner;
import java.util.EmptyStackException;

class Stack {
    private static final int MAX_SIZE = 1000;
    private int top;
    private int[] array;

    public Stack() {
        top = -1;
        array = new int[MAX_SIZE];
    }

    public void push(int item) {
        if (top == MAX_SIZE - 1) {
            System.out.println("Stack Overflow. Cannot push element: " + item);
            return;
        }
        array[++top] = item;
        System.out.println("Pushed: " + item);
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int poppedItem = array[top--];
        System.out.println("Popped: " + poppedItem);
        return poppedItem;
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return array[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack();

        char choice;
        do {
            System.out.print("1.Push ");
            System.out.print("2.Pop ");
            System.out.print("3.Peek ");
            System.out.println("4.Exit");

            System.out.print("Choice: ");
            int ch = scanner.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Ele: ");
                    int elementToPush = scanner.nextInt();
                    stack.push(elementToPush);
                    break;

                case 2:
                    try {
                        stack.pop();
                    } catch (EmptyStackException e) {
                        System.out.println("Stack Empty");
                    }
                    break;

                case 3:
                    try {
                        System.out.println(stack.peek());
                    } catch (EmptyStackException e) {
                        System.out.println("Stack Empty");
                    }
                    break;

                case 4:
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