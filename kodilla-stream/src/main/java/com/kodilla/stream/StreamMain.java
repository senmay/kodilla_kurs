package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("text", (s)->"ABC" + s + "ABC");
        poemBeautifier.beautify("text",(s)->s.toUpperCase());
        poemBeautifier.beautify("TEXT",(s)->s.toLowerCase());
        poemBeautifier.beautify("DOMINIK TRATATAsda", (s)->s.toLowerCase()+ " abABbc");
    }
}