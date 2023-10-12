package com.conditionals;

public class Conditions {
    public static void main(String[] args) {

//       Conditionals
//        Syntax
//        if (true){
//            statements....
//        }else{
//            statements....
//        }


        int salary = 30000;

        if(salary >= 50000){
            salary = salary + 5000;
        }else if(salary >= 30000 ){
            salary = salary+ 2000;
        }
        else{
            salary   = salary + 1000;
        }

        System.out.println(salary);


    }
}