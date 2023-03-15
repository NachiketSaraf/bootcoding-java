package com.bootcoding.java.opps.inheritance.example1;

class B extends A {
    private int a;

    void setB(int n1, int n2) {
        a = n1;
        a = n2;

    }

    void showB() {
        System.out.println("B = " + a);
    }
}
