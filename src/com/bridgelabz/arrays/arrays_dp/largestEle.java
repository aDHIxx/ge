package com.bridgelabz.arrays.arrays_dp;
import java.util.Arrays;
import java.util.Scanner;
public class largestEle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine(); //bcz nextInt() leaves a new line char and then later on nextLine() reads that new line char resulting in empty string
        String[] inpVals = sc.nextLine().split(" ");
        int[] arr = new int[n];
        int i=0;
        for(String inpVal:inpVals){
            arr[i++]=Integer.parseInt(inpVal);
        }
        System.out.println(largest(arr));
    }

    /* O(n) time complexity */
    public static int largest(int[] arr) { //static bcz we are calling it from static main method
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];

        }
        return max;
    }
    //using predefined functions
    public static int largestOne(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        return max;
    }
    public static int largestTwo(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }


}
