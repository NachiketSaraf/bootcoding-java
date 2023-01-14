package com.bootcoding.java.level_two_question;

import java.util.Scanner;

public class InputNumberMultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int nums = sc.nextInt();
        printMultiplicationTable(nums);
    }
    private static void printMultiplicationTable(int nums){
        int num = nums;
        int mult = 0;
        for(int i = 1; i <= 10; i++)
        {
            mult = num * i;
            System.out.println(num + " x " + i + " = " + mult);
        }

    }
}
