package com.bootcoding.java.level_two_question;

import java.util.Scanner;

public class ProductOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number");
        int num2 = scanner.nextInt();
        printProductOfTwoNumbers(num1,num2);

    }
    private static void printProductOfTwoNumbers(int num1 , int num2 ){
        int ele1 = num1;
        int ele2 = num2;
        int pro = ele1 * ele2;
        System.out.println("Product Of Given Two Numbers \n" + pro);
    }
}
