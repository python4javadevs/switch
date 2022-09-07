package com.python4javadevs.learn.switchdemo;

public enum MovieEnum {
    HOLY_GRAIL("Monty Python and the Holy Grail"),
    LIFE_OF_BRIAN("Life of Brian"),
    THE_MEANING_OF_LIFE("The Meaning of Life");

    private final String title;
    MovieEnum(final String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
