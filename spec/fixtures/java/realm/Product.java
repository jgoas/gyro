package com.gyro.tests;

/* DO NOT EDIT | Generated by gyro */

import io.realm.RealmObject;

public class Product extends RealmObject {

    public static final class Attributes {
        public static final String BRAND = "brand";
        public static final String NAME = "name";
        public static final String PRICE = "price";

        private Attributes() {
            // Hide constructor
        }
    }

    private String brand;
    private String name;
    private int price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(final String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(final int price) {
        this.price = price;
    }
}
