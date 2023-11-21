package com.bridgelabz.algorithm.searching;

import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int key= sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        String[] inpVals = sc.nextLine().split(" ");
        int[] arr = new int[n];
        int i = 0;
        for (String inVal : inpVals) {
            arr[i++] = Integer.parseInt(inVal);
        }
        System.out.println(bsearch(n,arr,key));
    }

    public static int bsearch(int n, int[] arr, int key) {
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;

    }
}
