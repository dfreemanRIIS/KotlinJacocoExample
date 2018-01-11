package com.example.donald.kotlinjacocoexample

class TextBuilder {
    fun getReturnString(button: String): String {
        if (button === "one") {
            return "You returned 1"
        }
        return if (button === "two") {
            "You returned 2"
        } else "OOPS"
    }
}