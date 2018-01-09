package com.example.donald.kotlinjacocoexample;

public class TextBuilder {
    public String getReturnString(String button) {
        if(button == "one") {
            return "You returned 1";
        }
        if(button == "two") {
            return "You returned 2";
        }
        return "OOPS";
    }
}