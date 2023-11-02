package com.example.modelsdao.model;
    public class GameModel {

        private int id;
        private String name;
        private String janr;
        private String novinka;
        private String plata;

        public GameModel(){}

        public GameModel(int id, String name, String janr, String novinka, String plata){
            this.id = id;
            this.name = name;
            this.janr = janr;
            this.novinka = novinka;
            this.plata = plata;
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

        public String getJanr() {
            return janr;
        }
        public void setJanr(String janr) {
            this.janr = janr;
        }
        public String getNovinka() {
            return novinka;
        }
        public void setNovinka(String novinka) {
            this.novinka = novinka;
        }
        public String getPlata() {
            return plata;
        }
        public void setPlata(String rare) {
            this.plata = plata;
        }



    }
