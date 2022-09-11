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

import unittest

import switch_demo
from movie import Movie


#
# Note: the repeated use of string and integer literals is for ILLUSTRATIVE
# PURPOSES ONLY.
#
# Constants should be used in real-world applications to reduce
# human error and code fragility.


class UsingIfElifElse(unittest.TestCase):
    """
    Test the compute_release_year_if function works properly
    """

    def test_compute_release_year_hg(self):
        self.assertEqual(1975, switch_demo.compute_release_year_if('Monty Python and the Holy Grail'))

    def test_compute_release_year_lob(self):
        self.assertEqual(1979, switch_demo.compute_release_year_if('Life of Brian'))

    def test_compute_release_year_mol(self):
        self.assertEqual(1983, switch_demo.compute_release_year_if('The Meaning of Life'))

    def test_compute_release_year_unknown_movie_title(self):
        self.assertEqual(None, switch_demo.compute_release_year_if('ABCDE'))

    def test_compute_release_year_none(self):
        self.assertEqual(None, switch_demo.compute_release_year_if(None))


class UsingDictionary(unittest.TestCase):
    """
    Test the compute_release_year_dictionary function works properly
    """

    def test_compute_release_year_hg(self):
        self.assertEqual(1975, switch_demo.compute_release_year_dictionary('Monty Python and the Holy Grail'))

    def test_compute_release_year_lob(self):
        self.assertEqual(1979, switch_demo.compute_release_year_dictionary('Life of Brian'))

    def test_compute_release_year_mol(self):
        self.assertEqual(1983, switch_demo.compute_release_year_dictionary('The Meaning of Life'))

    def test_compute_release_year_unknown_movie_title(self):
        self.assertEqual(None, switch_demo.compute_release_year_dictionary('ABCDE'))

    def test_compute_release_year_none_dict(self):
        self.assertEqual(None, switch_demo.compute_release_year_dictionary(None))


class UsingPatternMatch(unittest.TestCase):
    """
    Test the compute_release_year_pattern_match function works correctly
    """

    def test_compute_release_year_hg_movie_title(self):
        self.assertEqual(1975, switch_demo.compute_release_year_pattern('Monty Python and the Holy Grail'))

    def test_compute_release_year_lob_movie_title(self):
        self.assertEqual(1979, switch_demo.compute_release_year_pattern('Life of Brian'))

    def test_compute_release_year_mol_movie_title(self):
        self.assertEqual(1983, switch_demo.compute_release_year_pattern('The Meaning of Life'))

    def test_compute_release_year_hg_movie_object(self):
        holy_grail_movie = Movie('Monty Python and the Holy Grail', 1975)
        self.assertEqual(1975, switch_demo.compute_release_year_pattern(holy_grail_movie))

    def test_compute_release_year_lob_movie_object(self):
        life_of_brian_movie = Movie('Life of Brian', 1979)
        self.assertEqual(1979, switch_demo.compute_release_year_pattern(life_of_brian_movie))

    def test_compute_release_year_mol_movie_object(self):
        meaning_of_life_movie = Movie('The Meaning of Life', 1983)
        self.assertEqual(1983, switch_demo.compute_release_year_pattern(meaning_of_life_movie))

    def test_compute_release_year_unknown_movie_title(self):
        self.assertEqual(None, switch_demo.compute_release_year_pattern('ABCDE'))

    def test_compute_release_year_none(self):
        self.assertEqual(None, switch_demo.compute_release_year_pattern(None))


if __name__ == '__main__':
    unittest.main()
