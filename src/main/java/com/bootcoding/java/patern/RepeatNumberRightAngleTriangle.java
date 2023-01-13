package com.bootcoding.java.patern;

public class RepeatNumberRightAngleTriangle {
    public static void main(String[] args) {
        printRepeatNumberRightAngleTriangle();

    }
    private static void printRepeatNumberRightAngleTriangle(){
        for (int i = 1; i <= 4 ; i++ ){
            for (int j = 0 ; j < i ; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
