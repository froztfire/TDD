package com.csvmasterstdd.service;

public class IsbnCleanService {

    public String isbnClean(String str){
        String cleanedIsbn = str.replaceAll("[\\s-]", "");
        return cleanedIsbn;
    }
}
