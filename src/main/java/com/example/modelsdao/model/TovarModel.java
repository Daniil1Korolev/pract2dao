package com.example.modelsdao.model;
public class TovarModel {

    private int id;
    private int price;
    private int kolvo;
    private String name;
    private String vid;

    public TovarModel(){}

    public TovarModel(int id, int price, int kolvo, String name, String vid){
        this.id = id;
        this.price = price;
        this.kolvo = kolvo;
        this.name = name;
        this.vid = vid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getKolvo() {
        return kolvo;
    }

    public void setKolvo(int kolvo) {
        this.kolvo = kolvo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }


}
