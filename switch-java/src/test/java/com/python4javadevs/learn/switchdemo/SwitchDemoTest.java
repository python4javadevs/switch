package com.python4javadevs.learn.switchdemo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static com.python4javadevs.learn.switchdemo.Constants.HOLY_GRAIL_OBJECT;
import static com.python4javadevs.learn.switchdemo.Constants.HOLY_GRAIL_TITLE;
import static com.python4javadevs.learn.switchdemo.Constants.LIFE_OF_BRIAN_OBJECT;
import static com.python4javadevs.learn.switchdemo.Constants.LIFE_OF_BRIAN_TITLE;
import static com.python4javadevs.learn.switchdemo.Constants.MEANING_OF_LIFE_OBJECT;
import static com.python4javadevs.learn.switchdemo.Constants.MEANING_OF_LIFE_TITLE;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Testing SwitchDemo")
public class SwitchDemoTest {

    private SwitchDemo switchDemo;

    @BeforeEach
    public void setUp() {
        this.switchDemo = new SwitchDemo();
    }

    @Nested
    @DisplayName("When testing computeReleaseYearClassic()...")
    public class ComputeReleaseYearClassic {
        @Test
        @DisplayName("And movie title is Monty Python and the Holy Grail, Then release year should be 1975")
        public void computeReleaseYearClassicHG() {
            final Optional<Integer> releaseYearOptional = switchDemo.computeReleaseYearClassic(HOLY_GRAIL_TITLE);
            assertTrue(releaseYearOptional.isPresent());
            assertEquals(1975, releaseYearOptional.get());
        }

        @Test
        @DisplayName("And movie title is Life of Brian, Then release year should be 1979")
        public void computeReleaseYearClassicLOB() {
            final Optional<Integer> releaseYearOptional = switchDemo.computeReleaseYearClassic(LIFE_OF_BRIAN_TITLE);
            assertTrue(releaseYearOptional.isPresent());
            assertEquals(1979, releaseYearOptional.get());
        }

        @Test
        @DisplayName("And movie title is The Meaning of Life, Then release year should be 1983")
        public void computeReleaseYearClassicMOL() {
            final Optional<Integer> releaseYearOptional = switchDemo.computeReleaseYearClassic(MEANING_OF_LIFE_TITLE);
            assertTrue(releaseYearOptional.isPresent());
            assertEquals(1983, releaseYearOptional.get());
        }
        @Test
        @DisplayName("And movie title is not recognized, Then release year should be empty")
        public void computeReleaseYearFancyUnknown() {
            final Optional<Integer> releaseYearOptional = switchDemo.computeReleaseYearClassic("Monty Python's Flying Circus");
            assertFalse(releaseYearOptional.isPresent());
        }
    }

    @Nested
    @DisplayName("When testing computeReleaseYearArrow()...")
    public class ComputeReleaseYearArrow {
        @Test
        @DisplayName("And movie title is Monty Python and the Holy Grail, Then release year should be 1975")
        public void computeReleaseYearArrowHG() {
            assertEquals(1975, switchDemo.computeReleaseYearArrow(MovieEnum.HOLY_GRAIL));
        }

        @Test
        @DisplayName("And movie title is Life of Brian, Then release year should be 1979")
        public void computeReleaseYearArrowLOB() {
            assertEquals(1979, switchDemo.computeReleaseYearArrow(MovieEnum.LIFE_OF_BRIAN));
        }

        @Test
        @DisplayName("And movie title is The Meaning of Life, Then release year should be 1983")
        public void computeReleaseYearArrowMOL() {
            assertEquals(1983, switchDemo.computeReleaseYearArrow(MovieEnum.THE_MEANING_OF_LIFE));
        }
    }
    @Nested
    @DisplayName("When testing computeReleaseYearArrow()...")
    public class ComputeReleaseYearFancy {

        @Nested
        @DisplayName("And When passing movie titles (Strings)...")
        public class MovieTitleAsString {
            @Test
            @DisplayName("And movie title is Monty Python and the Holy Grail, Then release year should be 1975")
            public void computeReleaseYearFancyHG() {
                assertEquals(1975, switchDemo.computeReleaseYearFancy(HOLY_GRAIL_TITLE));
            }

            @Test
            @DisplayName("And movie title is Life of Brian, Then release year should be 1979")
            public void computeReleaseYearFancyLOB() {
                assertEquals(1979, switchDemo.computeReleaseYearFancy(LIFE_OF_BRIAN_TITLE));
            }

            @Test
            @DisplayName("And movie title is The Meaning of Life, Then release year should be 1983")
            public void computeReleaseYearFancyMOL() {
                assertEquals(1983, switchDemo.computeReleaseYearFancy(MEANING_OF_LIFE_TITLE));
            }

            @Test
            @DisplayName("And movie title is not recognized, Then release year should be null")
            public void computeReleaseYearFancyUnknown() {
                assertNull(switchDemo.computeReleaseYearFancy("Monty Python's Flying Circus"));
            }
        }

        @Nested
        @DisplayName("And When passing movie titles as MovieEnum...")
        public class MovieTitleAsEnum {
            @Test
            @DisplayName("And movie title is Monty Python and the Holy Grail, Then release year should be 1975")
            public void computeReleaseYearFancyHG() {
                assertEquals(1975, switchDemo.computeReleaseYearFancy(MovieEnum.HOLY_GRAIL));
            }

            @Test
            @DisplayName("And movie title is Life of Brian, Then release year should be 1979")
            public void computeReleaseYearFancyLOB() {
                assertEquals(1979, switchDemo.computeReleaseYearFancy(MovieEnum.LIFE_OF_BRIAN));
            }

            @Test
            @DisplayName("And movie title is The Meaning of Life, Then release year should be 1983")
            public void computeReleaseYearFancyMOL() {
                assertEquals(1983, switchDemo.computeReleaseYearFancy(MovieEnum.THE_MEANING_OF_LIFE));
            }
        }

        @Nested
        @DisplayName("And When passing Movie objects...")
        public class MovieAsObject {
            @Test
            @DisplayName("And movie title is Monty Python and the Holy Grail, Then release year should be 1975")
            public void computeReleaseYearFancyHG() {
                assertEquals(1975, switchDemo.computeReleaseYearFancy(HOLY_GRAIL_OBJECT));
            }

            @Test
            @DisplayName("And movie title is Life of Brian, Then release year should be 1979")
            public void computeReleaseYearFancyLOB() {
                assertEquals(1979, switchDemo.computeReleaseYearFancy(LIFE_OF_BRIAN_OBJECT));
            }

            @Test
            @DisplayName("And movie title is The Meaning of Life, Then release year should be 1983")
            public void computeReleaseYearFancyMOL() {
                assertEquals(1983, switchDemo.computeReleaseYearFancy(MEANING_OF_LIFE_OBJECT));
            }

            @Test
            @DisplayName("And movie title is null, Then a RuntimeException should be thrown")
            public void computeReleaseYearFancyNull() {
                assertThrows(RuntimeException.class, () -> switchDemo.computeReleaseYearFancy(null));
            }

            @Test
            @DisplayName("And movie title is null, Then an IllegalStateException should be thrown")
            public void computeReleaseYearFancyUnknown() {
                assertThrows(IllegalStateException.class,
                        () -> switchDemo.computeReleaseYearFancy(42));
            }
        }
    }
}