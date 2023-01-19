package com.bootcoding.java.level_two_question;

import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        printSumSeries(n);
    }

    private static void printSumSeries(int n) {
        int sum = 0;
//        int n = 121;
        int temp = n;
        while(n != 0)
        {
            int div = n/10;
            sum = sum + n%10;
            n = div;
        }
        System.out.println(sum);
    }
}
