package com.example.foody2.Models;

public class RestaurantModel {
    int pic1;
    String text5;
    String text6;

    public RestaurantModel(int pic1, String text5, String text6) {
        this.pic1 = pic1;
        this.text5 = text5;
        this.text6 = text6;
    }

    public int getPic1() {
        return pic1;
    }

    public void setPic1(int pic1) {
        this.pic1 = pic1;
    }

    public String getText5() {
        return text5;
    }

    public void setText5(String text5) {
        this.text5 = text5;
    }

    public String getText6() {
        return text6;
    }

    public void setText6(String text6) {
        this.text6 = text6;
    }
}
