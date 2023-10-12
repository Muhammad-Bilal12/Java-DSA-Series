package com.conditionals;

import java.util.Scanner;

public class CountNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amout: ");
        int n = sc.nextInt();

//        Which number occurence to find:
        System.out.print("Which number occurence to find: ");
        int find = sc.nextInt();


        int count = 0;

        while (n != 0) {
            int rem = n % 10;

            if (rem == find) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);


    }
}
