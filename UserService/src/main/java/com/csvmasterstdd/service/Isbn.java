package com.csvmasterstdd.service;

public class Isbn {

    private String isbnNumber;

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public Isbn(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public static Isbn of(String isbnNumber){
        return new Isbn(isbnNumber);
    }
}
