# CS 245 (Fall, 2017) PracticeAssignment02

Theresa Nguyen 
20363779

Liner Search times:
------------------------------------------------------------------------
Array size  = 50
Searches    = 20
total search time = 0ms. Average search time = 0.0ms

Array size  = 500
Searches    = 20
total search time = 0ms. Average search time = 0.0ms

Array size  = 5000
Searches    = 2000
total search time = 1ms. Average search time = 2.0E-4ms

Binary Recursive times:
------------------------------------------------------------------------
Array size  = 50
Searches    = 20
total search time = 0ms. Average search time = 0.0ms

Array size  = 500
Searches    = 20
total search time = 0ms. Average search time = 0.0ms

Array size  = 5000
Searches    = 20
total search time = 0ms. Average search time = 0.0ms

Binary Iterative times:
------------------------------------------------------------------------
Array size  = 50
Searches    = 20
total search time = 8ms. Average search time = 0.16ms

Array size  = 500
Searches    = 20
total search time = 5752ms. Average search time = 11.504ms

Array size  = 5000
Searches    = 20
total search time = 6083ms. Average search time = 1.2166ms

Array size  = 50000
Searches    = 20
Binary-Iterative: total search time = 3158ms. Average search time = 0.06316ms

-------------------------------------------------------------------------------
As the array sizes grow for linear search, so does the total search time.

As for binary recursive, as the array size grow, the time does not change. However,
it should as recursive is less efficient than binary iterative. It needs to recalculate 
and reset repeatedly. It seems like binary recursive search hits high < low, which 
returns -1. Thus, leading to a search time of 0.

As for binary iterative, as array size increases, the total search time increases but 
the average search time decreases.

