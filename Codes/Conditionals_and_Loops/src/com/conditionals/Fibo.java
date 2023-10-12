package com.conditionals;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
//        Find the Fibo character in the given point


        System.out.print("Enter Number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = 0;
        int end = 1;
        int count = 2;
//
////                     1 2 3 4 5 6 7 8 ...
////        fibo series: 0 1 1 2 3 5 8 13 ....
//
        while (count <= n) {
            int temp = end;
            end = end + start;
            start = temp;
            count++;
        }
        System.out.println(end);


    }
}
