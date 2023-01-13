package com.bootcoding.java.patern;

public class NumberRightAngleTriangle {
    public static void main(String[] args) {
        printNumberRightAngleTriangle();
    }
    private static void printNumberRightAngleTriangle(){
        for (int i = 1; i <=4 ; i++){
            for (int j = 1; j <= i ; j++ ){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
