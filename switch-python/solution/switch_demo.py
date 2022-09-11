#  Copyright 2022 J Steven Perry
#
#  Licensed under the Apache License, Version 2.0 (the "License");
#  you may not use this file except in compliance with the License.
#  You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
#  Unless required by applicable law or agreed to in writing, software
#  distributed under the License is distributed on an "AS IS" BASIS,
#  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
#  See the License for the specific language governing permissions and
#  limitations under the License.
#
#  Licensed under the Apache License, Version 2.0 (the "License");
#  you may not use this file except in compliance with the License.
#  You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
#  Unless required by applicable law or agreed to in writing, software
#  distributed under the License is distributed on an "AS IS" BASIS,
#  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
#  See the License for the specific language governing permissions and
#  limitations under the License.
#
# Demonstrates a few ways to implement the Java switch statement
# using the Python language:
# - if/elif/else
# - dictionary
# - PEP 634 structural pattern matching
from movie import Movie


#
# Note: the repeated use of string and integer literals is for ILLUSTRATIVE
# PURPOSES ONLY.
#
# Constants should be used in real-world applications to reduce
# human error and code fragility.


def compute_release_year_if(movie):
    """
    Compute and return the release year if the movie title is recognized
    or None if not recognized
    :param movie: The movie title to match on
    :return: As described above
    """
    if movie == 'Monty Python and the Holy Grail':
        return 1975
    elif movie == 'Life of Brian':
        return 1979
    elif movie == 'The Meaning of Life':
        return 1983
    else:
        return None


def compute_release_year_dictionary(movie):
    """
    Compute and return the release year if the movie title is recognized
    or None if not recognized
    :param movie: The movie title (dictionary key)
    :return: As described above
    """
    switch_dictionary = {
        'Monty Python and the Holy Grail': 1975,
        'Life of Brian': 1979,
        'The Meaning of Life': 1983
    }
    return switch_dictionary.get(movie, None)


def compute_release_year_pattern(movie):
    """
    Compute and return the release year if the movie is recognized
    or None if not recognized
    :param movie: The movie (either a String title or a Movie object)
    :return: As described above
    """
    # Use match/case to crack the movie and calculate its release year
    match movie:
        case 'Monty Python and the Holy Grail' | 'Life of Brian' | 'The Meaning of Life':
            return compute_release_year_dictionary(movie)
        case Movie():
            return movie.release_year
        case _:
            return None


if __name__ == '__main__':
    pass


