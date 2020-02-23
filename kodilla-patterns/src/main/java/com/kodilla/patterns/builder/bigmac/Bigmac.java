package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bigmac {

    private final String roll;
    private String sauce;
    private List<String> ingredients;

    public static class BuilderBigMac {

        public static final String ROLL_WITH_SESAME = "ROLL_WITH_SESAME";
        public static final String NORMAL_ROLL = "NORMAL_ROLL";
        public static final String WITHOUT_SAUCE = "WITHOUT_SAUCE";
        public static final String ONE_THOUSAND_ISLANDS_DRESSING = "1000_ISLANDS_DRESSING";
        public static final String STANDARD_SAUCE = "STANDARD_SAUCE";
        public static final String LETTUCE = "LETTUCE";
        public static final String ONION = "ONION";
        public static final String BACON = "BACON";
        public static final String CUCUMBER = "CUCUMBER";
        public static final String CHILI = "CHILI";
        public static final String MUSHROOMS = "MUSHROOMS";
        public static final String SHRIMPS = "SHRIMPS";
        public static final String CHEESE = "CHEESE";

        private List<String> availableSauces = Arrays.asList(WITHOUT_SAUCE, ONE_THOUSAND_ISLANDS_DRESSING, STANDARD_SAUCE);
        private List<String> availableIngredients = Arrays.asList(LETTUCE, ONION, BACON,
                CUCUMBER, CHILI, MUSHROOMS, SHRIMPS, CHEESE);

        private String roll;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BuilderBigMac roll(String roll) {
            this.roll = roll;
            return this;
        }

        public BuilderBigMac sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BuilderBigMac ingredients(String ingredient) {
            this.ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            if (!roll.equals(ROLL_WITH_SESAME) && !roll.equals(NORMAL_ROLL)) {
                throw new IllegalStateException("Chosen roll doesn't exist");
            }
            if (!availableSauces.contains(sauce)) {
                throw new IllegalStateException("Chosen sauce doesn't exist");
            }

            for (String currentIngredient : ingredients) {
                if (!availableIngredients.contains(currentIngredient)) {
                    throw new IllegalStateException("Chosen ingredients doesn't exist");
                }
            }

            return new Bigmac(roll, sauce, ingredients);
        }
    }

    private Bigmac(final String roll, String sauce, List<String> ingredients) {
        this.roll = roll;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public String getRoll() {
        return roll;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

}