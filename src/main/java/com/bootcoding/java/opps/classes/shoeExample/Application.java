package com.bootcoding.java.opps.classes.shoeExample;

import java.util.Random;

public class Application {

    public static void main(String[] args) {
        Random rd = new Random();

        String[] brand = {"Bata","Puma","Air Jorden"};

        String[] arrayOfColor ={"red","black","white","browne"};

        Shoe[] shoes = new Shoe[10];
        for (int i = 0;i<shoes.length;i++){
            shoes[i]=new Shoe();
            int randomIndexOfBrand = rd.nextInt(brand.length);
            shoes[i].brand=brand[randomIndexOfBrand];
            int randomIndexOfColour = rd.nextInt(arrayOfColor.length);
            shoes[i].color=arrayOfColor[randomIndexOfColour];
            shoes[i].price=rd.nextDouble(300,1500);
            shoes[i].size=rd.nextInt(6,9);
        }

        System.out.println("All created shoes");
        for (Shoe value : shoes) {
            System.out.println(value);
        }

        System.out.println();
        System.out.println("Only Shoes with size 8");

        for (Shoe shoe : shoes) if (shoe.size == 8) System.out.println(shoe);

    }

}
