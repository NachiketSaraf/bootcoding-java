package com.bootcoding.java.opps;

public class CycleAppliction {
    public static void main(String[] args) {
        Cycle ce = new Cycle();
        Cycle c1 = Cycle.createcycle();
        Cycle c2 = Cycle.createcycle( "gc", 9, "hero");
        Cycle.printcycle(c1);
        Cycle.printcycle(c2);
        c1.brand = "HERO";
        c1.type = "GearCycle";
        c1.weight = 10;

        GearCycle gc = new GearCycle();
        gc.brand = "Herculys";
        gc.type = "GearCycle";
        gc.weight = 15;

        MountainCycle mc = new MountainCycle();
        mc.brand = "MountainCycle";
        mc.type = "Mountain Cycle";
        mc.weight = 8;



    }
}
