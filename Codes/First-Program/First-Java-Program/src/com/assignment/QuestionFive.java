package com.assignment;

import java.util.Scanner;

public class QuestionFive {
    public static void main(String[] args) {
//        Take 2 numbers as input and print the largest number.

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Number2: ");
        int num2 = sc.nextInt();


        if(num1>num2){
            System.out.println(num1+" is greater than "+num2);
        }else{
            System.out.println(num2+" is greater than "+num1);
        }


    }
}
