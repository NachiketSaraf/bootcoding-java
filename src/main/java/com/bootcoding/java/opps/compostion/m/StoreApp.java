package com.bootcoding.java.opps.compostion.m;

public class StoreApp {
    public static void main(String[] args) {
        Staff[] st= new Staff[5];
        for(int i=0; i<5; i++){
            st[i] = new Staff();
        }
        Shop sh = new Shop();
        sh.staff = st;
        System.out.println(sh.staff);

    }
}
