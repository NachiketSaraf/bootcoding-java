package com.bootcoding.java.opps.inheritance;

public class Appliction {
    public static void main(String[] args) {
        ComputerTable ct = new ComputerTable();
        ct.legs = 4;
        ct.tabletop = true;
        ct.material = new Material();
        ct.tabletype = "Compute";
        ct.createTable();
        ct.move();

        DinningTable di = new DinningTable();
        di.legs = 4;
        di.tabletop = true;
        di.material = new Material();
        di.tabletype = "dinning";
        di.createTable();
        di.move();

        DressingTable drt = new DressingTable();
        drt.legs = 4;
        drt.tabletop = true;
        drt.material = new Material();
        drt.tabletype = "Dressing";
        drt.createTable();
        drt.move();
    }
}
