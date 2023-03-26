package com.bootcoding.java.opps.inheritance.tyre;

public class Application {
    public static void main(String[] args) {
        TubelessTyre tl = new TubelessTyre();
        tl.company = "MRF";
        tl.material = "Rubber";
        tl.type = "TubeLess";
        tl.compatable = "Car";
        tl.diameter = 17;
        System.out.println(tl);

        System.out.println();

        TubeTyre tt = new TubeTyre();
        tt.company="CEAT";
        tt.material="Rubber";
        tt.type = "Tuber";
        tt.compatable ="Mountain bike";
        tt.diameter = 20;
        System.out.println(tt);

        System.out.println();

        TubelessTyre tl1 = new TubelessTyre();
        tl.company = "CEAT";
        tl.material = "Rubber";
        tl.type = "TubeLess";
        tl.compatable = "bike";
        tl.diameter = 19;
        System.out.println(tl1);


    }

}
