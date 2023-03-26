package com.bootcoding.java.opps.classes.example1;

class Employee1 {

    private String name;
    private int age;
    private double basic;

    public void setEmployee(String n,int a,double bs){
        name = n;
        age = a;
        basic = bs;
    }
    public void showEmployee(){
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Basic = " + basic);
    }
    public void calculate(){
        double da = basic*10/100;
        double hra = basic*15/100;
        double gs = basic + hra+da;
    }
}