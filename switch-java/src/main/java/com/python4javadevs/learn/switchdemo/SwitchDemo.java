package com.python4javadevs.learn.switchdemo;

import java.util.Optional;

import static com.python4javadevs.learn.switchdemo.Constants.HOLY_GRAIL_TITLE;
import static com.python4javadevs.learn.switchdemo.Constants.LIFE_OF_BRIAN_TITLE;
import static com.python4javadevs.learn.switchdemo.Constants.MEANING_OF_LIFE_TITLE;

public class SwitchDemo {

    /**
     * Compute the release year for the specified movie title and return an Optional containing
     * the release year, or an empty Optional if the movie title is not recognized.
     * <p>
     * Uses switch that performs String matching
     *
     * @param movieTitle The movie title
     * @return As described above
     */
    Optional<Integer> computeReleaseYearClassic(final String movieTitle) {
        final Optional<Integer> yearOfRelease;
        switch (movieTitle) {
            case HOLY_GRAIL_TITLE:
                yearOfRelease = Optional.of(1975);
                break;
            case LIFE_OF_BRIAN_TITLE:
                yearOfRelease = Optional.of(1979);
                break;
            case MEANING_OF_LIFE_TITLE:
                yearOfRelease = Optional.of(1983);
                break;
            default:
                yearOfRelease = Optional.empty();
        }

        return yearOfRelease;
    }

    /**
     * Compute and return the release year for the specified MovieEnum.
     * <p>
     * Uses switch that performs Enum matching
     *
     * @param movie The MovieEnum member to match
     * @return As described above
     */
    Integer computeReleaseYearArrow(final MovieEnum movie) {
        return switch (movie) {
            case HOLY_GRAIL -> 1975;
            case LIFE_OF_BRIAN -> 1979;
            case THE_MEANING_OF_LIFE -> 1983;
        };
    }

    /**
     * Compute and return the release year for the specified object using
     * <a href="https://openjdk.org/jeps/406">JEP 406 Pattern Matching for switch preview functionality</a>.
     * (Pretty fancy IMHO)
     * <p>
     * Throw an exception if the type is not supported,
     * which includes null (arguably fancy as well).
     *
     * @param thing The object for which the release year is to be computed in
     *              a fancy way
     * @return As described above
     */
    Integer computeReleaseYearFancy(final Object thing) {
        return switch (thing) {
            case null -> throw new RuntimeException("Cannot be null!");

            case String movieTitle -> computeReleaseYearClassic(movieTitle).orElse(null);
            case MovieEnum movieEnum -> computeReleaseYearArrow(movieEnum);
            case Movie movieObj -> movieObj.getReleaseYear();

            default -> throw new IllegalStateException("Unexpected value: " + thing);
        };
    }
}
