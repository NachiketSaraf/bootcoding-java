package com.bootcoding.java.opps.inheritance.tyre;

public class TubelessTyre extends Tyre{
    @Override
    public String toString() {
        return "TubelessTyre > " +
                "company= '" + company + '\'' +
                ", material= '" + material + '\'' +
                ", type= '" + type + '\'' +
                ", compatable= '" + compatable + '\'' +
                ", diameter=" + diameter;
    }
}
