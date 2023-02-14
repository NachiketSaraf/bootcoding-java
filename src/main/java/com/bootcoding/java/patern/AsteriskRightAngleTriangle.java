package com.bootcoding.java.patern;

public class AsteriskRightAngleTriangle {
    public static void main(String[] args) {
        printRightAngleTranngle(1);
    }
    private static void printRightAngleTranngle(int n){
        for (int i =0 ; i <= n ; i++ ){
            for (int j = 0 ; j < i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
