/*
 * Copyright 2022 J Steven Perry
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.python4javadevs.learn.switchdemo;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * A Movie, along with some properties a movie might have.
 */
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
