package com.bridgelabz.strings.strings_dp;

import java.util.Scanner;

public class reverseString {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] arr = str.toCharArray();
        String rev = "";
        for(int i = str.length() - 1; i >= 0; i--)
        {
            rev += str.charAt(i);
        }
        System.out.println(rev);
        //StringBuffer
        //StringBuffer str_buff = new StringBuffer(str);
        //str_buff.reverse();
        //StringBuilder
        //StringBuilder str_builder = new StringBuilder();
        //str_builder.append(str);
        //str_builder.reverse();

    }
}
