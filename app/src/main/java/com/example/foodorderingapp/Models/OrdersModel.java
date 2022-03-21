package com.example.foodorderingapp.Models;

public class OrdersModel {
    int orderImage;
    String soldItemName,price,orderNumber;

    public OrdersModel(int orderImage, String soldItemName, String price, String orderNumber) {
        this.orderImage = orderImage;
        this.soldItemName = soldItemName;
        this.price = price;
        this.orderNumber = orderNumber;
    }

    public int getOrderImage() {
        return orderImage;
    }

    public String getSoldItemName() {
        return soldItemName;
    }

    public String getPrice() {
        return price;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderImage(int orderImage) {
        this.orderImage = orderImage;
    }

    public void setSoldItemName(String soldItemName) {
        this.soldItemName = soldItemName;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
}
