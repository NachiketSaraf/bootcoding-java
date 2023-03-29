package com.bootcoding.java.opps.compostion.m;

public class Application {
    public static void main(String[] args) {
        Latches[] l = new Latches[3];
        for(int i=0; i<3; i++){
            l[i]= new  Latches();
        }
        Door d= new Door();
        d.latch = l;
        System.out.println();

    }
}
