package com.python4javadevs.learn.switchdemo;

public class Constants {
    public static final String HOLY_GRAIL_TITLE = "Monty Python and the Holy Grail";
    public static final String LIFE_OF_BRIAN_TITLE = "Life of Brian";
    public static final String MEANING_OF_LIFE_TITLE = "The Meaning of Life";

    public static final Movie HOLY_GRAIL_OBJECT = new Movie().setTitle(HOLY_GRAIL_TITLE).setReleaseYear(1975);
    public static final Movie LIFE_OF_BRIAN_OBJECT = new Movie().setTitle(LIFE_OF_BRIAN_TITLE).setReleaseYear(1979);
    public static final Movie MEANING_OF_LIFE_OBJECT = new Movie().setTitle(MEANING_OF_LIFE_TITLE).setReleaseYear(1983);
}
