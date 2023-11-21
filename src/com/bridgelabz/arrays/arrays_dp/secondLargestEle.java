package com.bridgelabz.arrays.arrays_dp;
import java.util.Scanner;
public class secondLargestEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] inpVals = sc.nextLine().split(" ");
        int[] arr = new int[n];
        int i = 0;
        for (String inVal : inpVals) {
            arr[i++] = Integer.parseInt(inVal);
        }
        System.out.println(secondLargest(arr));

    }

    public static int secondLargest(int[] arr) {
        if (arr.length < 2) {
            return -1;
        }
        int first = arr[0];
        int second = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }
        if (second!=0) {
            return second;
        }
        return 0;
    }
}
