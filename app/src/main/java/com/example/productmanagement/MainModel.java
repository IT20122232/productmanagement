package com.example.productmanagement;

public class MainModel {

    String name,price,production,purl;

    MainModel()
    {

    }
    public MainModel(String name, String price, String production, String purl) {
        this.name = name;
        this.price = price;
        this.production = production;
        this.purl = purl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String getPurl() {
        return purl;
    }

    public void setPurl(String purl) {
        this.purl = purl;
    }
}
