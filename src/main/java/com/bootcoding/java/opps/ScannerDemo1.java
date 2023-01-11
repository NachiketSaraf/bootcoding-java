package com.bootcoding.java.opps;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter maths marks: ");
        int maths = scanner.nextInt();
        System.out.println("Enter physics marks: ");
        int physics = scanner.nextInt();
        System.out.println("Enter Chemistry marks: ");
        int chemistry = scanner.nextInt();

        double percentages = calcPercentages(maths, physics, chemistry);
        char grade = calcGrade(percentages);
        double average = calcAverage(maths, physics, chemistry);

        System.out.printf(" %.2f percentages ", percentages);
        System.out.println("Avg:" + average);
        System.out.println("Grade" + grade);

    }


    public static double calcPercentages(int maths, int physics, int chemistry) {

        double sum = maths + physics + chemistry;
        return (sum / 300) * 100;

    }

    public static double calcAverage(int maths, int physics, int chemistry) {
        double avg = (maths + physics + chemistry) / 3;
        return avg;
    }

    public static char calcGrade(double percentages) {
        if (percentages >= 70) {
            return 'A';

        } else if (percentages >= 35) {
            return 'B';
        } else {
            return 'C';
        }
    }


}



/*
wam to find largest lement of an array

public int FindLrgest(int[] numbers){
}

wam to check whether square of x exist in given array or not
public boolen existSqur(int[] numbers , int target{
}
 */


