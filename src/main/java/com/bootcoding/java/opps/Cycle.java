package com.bootcoding.java.opps;

public class Cycle {
    String type;
    double weight;
    String brand;

    public static Cycle createcycle(){
        Cycle cycle = new Cycle();
        cycle.type = "gear cycle";
        cycle.weight = 60.5;
        cycle.brand = "Lady-bird";
        return cycle;
    }
    public static Cycle createcycle(String T, double W, String B){
        Cycle cycle = new Cycle();
        cycle.type = T;
        cycle.weight = W;
        cycle.brand = B;
        return cycle;
    }
    public static void printcycle(Cycle c){
        System.out.println("Type = "+c.type);
        System.out.println("Weight = "+c.weight);
        System.out.println("Brand = "+c.brand);
    }

}
