package com.bootcoding.java.opps.inheritance;

public class Table {
    int legs;
    boolean tabletop;
    String tabletype;
    Material material;

    public void move(){
        System.out.println("Move the table to another location");
    }
    public void createTable(){
        System.out.println("Create new table");
    }
}

