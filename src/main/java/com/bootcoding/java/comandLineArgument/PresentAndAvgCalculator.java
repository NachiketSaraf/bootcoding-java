package com.bootcoding.java.comandLineArgument;

import javax.swing.plaf.PanelUI;

public class PresentAndAvgCalculator {
    public static void main(String[] args) {
        if (args.length < 4){
            System.out.println("Invalid input! please provide proper input");
        }else {
            if (args[0].equals("average")) {
                System.out.printf("average = %.3f ", averageCalculator(args));
            } else if (args[0].equals("percentage")) {
                System.out.printf("percentage = %.3f", percentageCalculator(args));
            } else {
                System.out.println("Invalid");
            }
        }
    }
    public static double averageCalculator(String[] marks){
        double totalMarks = 0;
        double avg ;
        for (int i = 1;i<marks.length;i++){
            totalMarks += Double.parseDouble(marks[i]);
        }
        avg = totalMarks/(marks.length-1);
        return avg;
    }
    public static double percentageCalculator(String[] marks){
        double totalMarks = 0;
        int totalSubjects = marks.length-1;
        double per ;
        for (int i = 1;i<marks.length;i++){
            totalMarks += Double.parseDouble(marks[i]);
        }
        per = totalMarks/(totalSubjects*100) *100;
        return per;
    }
}
