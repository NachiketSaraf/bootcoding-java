package com.bootcoding.java.patern;

public class AsteriskDiamond {
    public static void main(String[] args) {
        printAsteriskDiamond();
    }
    private static void printAsteriskDiamond(){
        int row = 4;
        for (int i = 1 ; i <= row  ; i++){
            for (int j = row-i ; j > 0 ; j--){
                System.out.print(" ");
            }
            for (int j = 0 ; j < i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = row ; i >0 ; i--){
            for (int j = row-i ; j > 0 ; j--){
                System.out.print(" ");
            }
            for (int j = i ; j > 0 ; j--){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
