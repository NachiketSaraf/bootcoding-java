package com.bootcoding.java.level_two_question;

import java.util.Scanner;

public class Remainder3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number ");

        int num = sc.nextInt();

        checkRemainder(num);
    }
    private static void checkRemainder(int num){
        for (int i = 1;i <= 100; i++){
            if (i % num == 3){
                System.out.println(i);
            }
        }
    }
}
