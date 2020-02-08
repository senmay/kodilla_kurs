package com.kodilla.good.patterns.challenges;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        System.out.println(movieStore.getMovies());
        String displayBooks = movieStore.getMovies().entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.joining("!"));
        System.out.println(displayBooks);

    }
}
