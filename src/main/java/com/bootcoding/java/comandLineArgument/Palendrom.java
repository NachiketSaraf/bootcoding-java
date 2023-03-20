package com.bootcoding.java.comandLineArgument;

public class Palendrom {
    public static void main(String[] args) {
        checkPalendrom(args);
    }
    public static void checkPalendrom(String[] num){
        for (int i = 0; i< num.length;i++){
            int n = Integer.parseInt(num[i]);
            int temp = n;
            int rem=0;
            while (n!=0){
                rem = rem*10 + n%10;
                n = n/10;
            }
            if(temp == rem){
                System.out.println(temp+" is palendrom");
            }
            else System.out.println(temp+" is not palendrom");
        }
    }
}
