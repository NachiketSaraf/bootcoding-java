package com.bootcoding.java.opps;

public class Bus {
    String fuelType;
    String color;
    String brand;
    double length;
    double width;
    double height;

    public String getDimensionUnit() {
        return dimensionUnit;
    }

    public void setDimensionUnit(String dimensionUnit) {
        this.dimensionUnit = dimensionUnit;
    }

    String dimensionUnit;
    int capacity;

    public String getFuelType() {
        return fuelType;
    }

    public void setFuleType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bus{" +
                " Brand='" + brand + '\'' +
                ", FuelType='" + fuelType + '\'' +
                ", Color='" + color + '\'' +
                ", Length=" + length +
                ", Width=" + width +
                ", Height=" + height +
                ", Capacity=" + capacity +
                '}';
    }

    public static void main(String[] args) {
        Bus bus1 =new Bus();
        bus1.setBrand("Tata");
        bus1.setFuleType("CNG");
        bus1.setColor("Black");
        bus1.setDimensionUnit("meter");
        bus1.setHeight(8);
        bus1.setWidth(5);
        bus1.setLength(20);
        bus1.setCapacity(45);
        System.out.println(bus1);

    }

}

