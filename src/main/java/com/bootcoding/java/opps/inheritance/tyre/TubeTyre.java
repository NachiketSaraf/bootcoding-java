package com.bootcoding.java.opps.inheritance.tyre;

public class TubeTyre extends Tyre{
    @Override
    public String toString() {
        return "TubeTyre{" +
                "company='" + company + '\'' +
                ", material='" + material + '\'' +
                ", type='" + type + '\'' +
                ", compatable='" + compatable + '\'' +
                ", diameter=" + diameter +
                '}';
    }
}
