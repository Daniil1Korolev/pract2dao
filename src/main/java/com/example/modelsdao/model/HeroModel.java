package com.example.modelsdao.model;


public class HeroModel {

    private int id;
    private String name;
    private String sila;
    private String attribute;
    private String rare;

    public HeroModel(){}

    public HeroModel(int id, String name, String sila, String attribute, String rare){
        this.id = id;
        this.name = name;
        this.sila = sila;
        this.attribute = attribute;
        this.rare = rare;
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

    public String getSila() {
        return sila;
    }
    public void setSila(String sila) {
        this.sila = sila;
    }
    public String getAttribute() {
        return attribute;
    }
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
    public String getRare() {
        return rare;
    }
    public void setRare(String rare) {
        this.rare = rare;
    }



}
