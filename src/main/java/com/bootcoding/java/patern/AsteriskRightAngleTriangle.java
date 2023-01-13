package com.bootcoding.java.patern;

public class AsteriskRightAngleTriangle {
    public static void main(String[] args) {
        printRightAngleTranngle();
    }
    private static void printRightAngleTranngle(){
        for (int i =0 ; i <= 4 ; i++ ){
            for (int j = 0 ; j < i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
