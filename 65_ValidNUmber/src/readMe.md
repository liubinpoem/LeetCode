Validate if a given string is numeric.

Some examples:
"0" => true
" 0.1 " => true
"abc" => false
"1 a" => false
"2e10" => true

Note: It is intended for the problem statement to be ambiguous. You should gather all requirements up front before implementing one.

The most difficult part is border exception process.
For example:
.1
0e
0e1
5e
0.1e
.e2

In that case, test cases are so complex.
Some of them are orthodox.
Use regular match is a good way.