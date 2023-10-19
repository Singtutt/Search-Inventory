package com.pluralsight;

public class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    } public int getId() {
        return id;
    } public String getName() {
        return name;
    } public double getPrice() {
        return getPrice();
    } @Override
    public String toString() {
        return "ID: " + id + " " + name + " | Price: $" + String.format("%.2f", price);
    }
}
