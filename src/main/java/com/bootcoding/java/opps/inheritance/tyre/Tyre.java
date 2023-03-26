package com.bootcoding.java.opps.inheritance.tyre;

public class Tyre {
    String company;
    String material;
    String type;
    String compatable;
    double diameter;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }



    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCompatable() {
        return compatable;
    }

    public void setCompatable(String compatable) {
        this.compatable = compatable;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Tyre{" +
                "company='" + company + '\'' +
                ", material='" + material + '\'' +
                ", type='" + type + '\'' +
                ", compatable='" + compatable + '\'' +
                ", diameter=" + diameter +
                '}';
    }
    protected void fillAir(double psi){

    }
    protected void fitting(){

    }
    protected void puncher(){
        
    }
}
