package com.bootcoding.java.level_two_question;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number");
        int num2 = scanner.nextInt();
        printSum(num1,num2);
        printSub(num1,num2);
        printMultiply(num1,num2);
        printDivide(num1,num2);
        printRemainder(num1,num2);
    }

    private static void printSum(int num1, int num2) {
        int ele1 = num1;
        int ele2 = num2;
        int sum = ele1 + ele2;
        System.out.println("Sum of given no is: "+ ele1 + " + " + ele2 + " = " + sum);
    }

    private static void printSub(int num1, int num2) {
        int ele1 = num1;
        int ele2 = num2;
        int sub = ele1 - ele2;
        System.out.println("Subtract of given no is: "+ ele1 + " - " + ele2 + " = " + sub);
    }

    private static void printMultiply(int num1, int num2) {
        int ele1 = num1;
        int ele2 = num2;
        int mult = ele1 * ele2;
        System.out.println("Multiplication of given no is: "+ ele1 + " * " + ele2 + " = " + mult);
    }

    private static void printDivide(int num1, int num2) {
        int ele1 = num1;
        int ele2 = num2;
        int div = ele1 / ele2;
        System.out.println("Division of given no is: "+ ele1 + " / " + ele2 + " = " + div);

    }

    private static void printRemainder(int num1, int num2) {
        int ele1 = num1;
        int ele2 = num2;
        int rem = ele1 % ele2;
        System.out.println("Reminder of given no is: "+ ele1 + " % " + ele2 + " = " + rem);

    }
}
