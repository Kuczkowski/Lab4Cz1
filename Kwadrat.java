package com.company;

public class Kwadrat {
    int pole, obwod;
    Kwadrat(int a){
        this.pole=a;
        this.obwod=a;
    }

    void setPole(){
        System.out.println("Pole to: "+ Math.pow(this.pole,2));
    }
    void setObwod(){
        System.out.println("Obwód to: "+this.obwod*4);
    } }