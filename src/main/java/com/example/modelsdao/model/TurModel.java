package com.example.modelsdao.model;

public class TurModel {

    private int id;
    private String name;
    private int price;
    private String city;
    private String country;

    public TurModel(){}

    public TurModel(int id, String name, int price, String city, String country){
        this.id = id;
        this.name = name;
        this.price = price;
        this.city = city;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String vid) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String vid) {
        this.country = country;
    }


}
