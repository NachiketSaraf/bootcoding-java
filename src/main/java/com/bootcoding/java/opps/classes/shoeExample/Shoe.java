package com.bootcoding.java.opps.classes.shoeExample;

//create 10 shoes with different sizes 6 7 8 and print only thoes whoes size is 8
public class Shoe {
    String color;
    int size;
    double price;
    String brand;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Shoe{" +
                "color='" + color + '\'' +
                ", size=" + size +
                ", price= " + String.format("%,.2f", price) +
                ", brand='" + brand + '\'' +
                '}';
    }
}
