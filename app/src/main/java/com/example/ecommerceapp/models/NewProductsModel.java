package com.example.ecommerceapp.models;

public class NewProductsModel {

    String description;
    String name;
    int price;
    String rating;
    String img_url;

    public NewProductsModel() {
    }

    public NewProductsModel(String description, String name, int price, String rating, String img_url) {
        this.description = description;
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.img_url = img_url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }
}