package com.csvmasterstdd.service;

public class IsbnCleanService {



    public String isbnClean(Isbn isbn){
        String cleanedIsbn = isbn.getIsbnNumber().replaceAll("[\\s-]", "");
        return cleanedIsbn;
    }
}
