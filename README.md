# Implement Java switch using Python

This source repo accompanies the YouTube video of the same name.

Structure of the repo
----

```
├── LICENSE
├── README.md
├── switch-java
│   ├── pom.xml
│   └── src
│       ├── main
│       └── test
└── switch-python
    ├── movie.py
    ├── solution
    │   ├── __init__.py
    │   └── switch_demo.py
    ├── switch_demo.py
    └── tests
        ├── __init__.py
        └── test_switch_demo.py
```

* `LICENSE` - Apache 2.0 license file

* `README.md` - This file.

* `switch-java` - A maven project containing the Java language implementation of the switch concept using the Java `switch` statement, from both the fall-through syntax from JDK 8 and before, the arrow (no fall through) syntax introduced in JDK 13 and the pattern matching syntax introduced in JDK 17.

* `switch-python` - The Python implementation of the switch concept, using various methods, including the new `match/case` structural pattern matching introduced in Python 3.10. 

    * The `switch_demo.py` module is the one where you add your code if you want to follow along with the video
    or complete on your own as an exercise (requires Python 3.10 or higher).


Notes
----

* You'll need Python 3.10 or higher on your computer if you want to run all of the Python examples in this video.

* Use the code in the `tests` package (in the `test_switch_demo.py` module) for the specifications for how the code should work. If you are a fan of TDD (like I am)
then you can use 


Looking for the solution?
----
The `solution` package contains the working solution in the `switch_demo.py` module.
You can use it as reference, or just copy it into the project's root directory (you know, if you're feeling lazy, I mean, in a hurry).


Find a bug?
----
Awesome! Please open an issue against *THIS REPO* with ***A DETAILED DESCRIPTION OF THE PROBLEM*** (*please* include
as much information as you think you would need to reproduce the problem if you were in my shoes).

Or better yet: fork the repo and open a PR!

----

Questions? Email: python4javadevs@proton.me
----