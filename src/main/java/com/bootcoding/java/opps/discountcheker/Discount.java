package com.bootcoding.java.opps.discountcheker;

public class Discount {
    public int giveDiscount(Customer c) {
        if (c.type == "Regular") {
            return 40;
        } else if (c.type == "premium") {
            return 50;
        } else if (c.type == "Non-regular") {
            return 10;
        } else
            System.out.println("Wrong type");
        return 0;
    }
}
