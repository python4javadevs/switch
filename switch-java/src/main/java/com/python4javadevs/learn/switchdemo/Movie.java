package com.python4javadevs.learn.switchdemo;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Movie {

    private String title;
    private Integer releaseYear;

    public String getTitle() {
        return title;
    }

    public Movie setTitle(final String title) {
        this.title = title;
        return this;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public Movie setReleaseYear(final Integer releaseYear) {
        this.releaseYear = releaseYear;
        return this;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final Movie movie = (Movie) o;

        return new EqualsBuilder().append(title, movie.title).append(releaseYear, movie.releaseYear).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(title).append(releaseYear).toHashCode();
    }
}
