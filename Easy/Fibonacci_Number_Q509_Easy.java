
package Fibonacci_Number_Q509_Easy;

/*
I solved this using the recursion idea I learned in my DSA Y1S2 module under the Recursion topic.

Fibonacci is defined as:
F(n) = F(n-1) + F(n-2)

So I directly applied this definition in code using recursion.
The function keeps calling itself with smaller values until it reaches the base case.

This helps me understand how recursion breaks a problem into smaller subproblems.
*/

class Solution {
    public int fib(int n) {

        int result = -99;

        if (n == 0) {

            result = 0;

        }

        else if(n == 1){

            result = 1;

        }

        else{

            result = fib(n - 1) + fib(n - 2);

        }

        return result;

    }
}