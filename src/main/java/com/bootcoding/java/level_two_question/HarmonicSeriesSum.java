package com.bootcoding.java.level_two_question;

import java.util.Scanner;

public class HarmonicSeriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        printHarmonicSeriesSum(num);
    }

    private static void printHarmonicSeriesSum(int num) {
        float sum = 0;
        for (float i=1;i<=num;i++){
            System.out.print("1/" + i + " + ");
            sum = sum+ (1/i);
        }
        System.out.println("Sum of Series upto" + num + " terms : " + sum );
    }
}
