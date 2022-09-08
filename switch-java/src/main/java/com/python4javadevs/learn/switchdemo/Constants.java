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

/**
 * Constants the program needs
 */
public class Constants {
    public static final String HOLY_GRAIL_TITLE = "Monty Python and the Holy Grail";
    public static final String LIFE_OF_BRIAN_TITLE = "Life of Brian";
    public static final String MEANING_OF_LIFE_TITLE = "The Meaning of Life";

    public static final Movie HOLY_GRAIL_OBJECT = new Movie().setTitle(HOLY_GRAIL_TITLE).setReleaseYear(1975);
    public static final Movie LIFE_OF_BRIAN_OBJECT = new Movie().setTitle(LIFE_OF_BRIAN_TITLE).setReleaseYear(1979);
    public static final Movie MEANING_OF_LIFE_OBJECT = new Movie().setTitle(MEANING_OF_LIFE_TITLE).setReleaseYear(1983);
}
