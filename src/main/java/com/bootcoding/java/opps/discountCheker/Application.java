package com.bootcoding.java.opps.discountCheker;

public class Application {
    public static void main(String[] args) {
        Customer ram = new Customer();
        ram.name = "ram";
        ram.type ="Regular";
        Discount ramDiscount = new Discount();
        int discount = ramDiscount.giveDiscount(ram);
        System.out.println(ram.name+" is a "+ram.type+" customer and got a discount of "+discount);

        Customer sham = new Customer();
        sham.name = "Sham";
        sham.type ="Regular";
        Discount shamDiscount = new Discount();
        int discountSham = ramDiscount.giveDiscount(ram);
        System.out.println(ram.name+" is a "+ram.type+" customer and got a discount of "+discountSham);
    }
}
