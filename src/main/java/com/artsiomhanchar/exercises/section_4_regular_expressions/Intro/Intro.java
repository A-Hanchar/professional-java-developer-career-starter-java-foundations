package com.artsiomhanchar.exercises.section_4_regular_expressions.Intro;

public class Intro {
//    Backreferences
//Java Regular Expressions also support backreferences. This is a capability of a regex to refer
//back to a capture group from earlier in the expression. For example - if given a string:
//“aaabbb12345cccdddzzz12345”
//We could write a regex that matches the same sequence of numbers like so:
//“[a-z]+(\\d{5})[a-z]+\\1”
//Where:
//“[a-z]+” matches “aaabbb”
//“(\\d{5})” matches “12345” AND is stored in reference #1
//“[a-z]+” also matches “cccdddzzz”
//“\\1” refers back to capture group #1 which is “12345”
//We can also use named capture groups with backreferences like so:
//“[a-z]+(?<nums>\\d{5})[a-z]+\\k<nums>”
//Note the use of “\\k<nums>” to refer back to the named capture group of “nums”. Be sure to
//include the “k” in “\\k” to indicate you’re backreferencing a named group.
}
