package com.assignment;

import java.util.Scanner;

public class QuestionTwo {
    public static void main(String[] args) {

//        Take name as input and print a greeting message for that particular name.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your name: ");
        String name = sc.nextLine();

        System.out.println("Good Morning, "+ name);


    }
}
