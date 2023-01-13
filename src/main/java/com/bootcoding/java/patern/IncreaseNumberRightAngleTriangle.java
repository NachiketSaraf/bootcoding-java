package com.bootcoding.java.patern;

public class IncreaseNumberRightAngleTriangle {
    public static void main(String[] args) {
    printIncreaseNumberRightAngleTriangle();
    }
    private static void printIncreaseNumberRightAngleTriangle(){
        int sum = 1;
        for (int i = 1; i <= 4; i++){
            for (int j =1; j <= i; j++){
                System.out.print(sum + " ");
                sum = sum + 1 ;
            }
            System.out.println();
        }
    }
}
