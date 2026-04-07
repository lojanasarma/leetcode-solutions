package Reverse_Integer_Q7_Easy;

import java.util.Scanner;

/*
Intuition - Problem Understanding

At first, I understood the problem by reading it 2–3 times and relating it to previously solved questions
and concepts from my study modules.

During the solution process, I realized that handling negative values correctly is important,
especially when converting between string and long representations.

Initially, I considered using Math.abs(), which I was already familiar with from my lectures,
and it helped me clarify the logic for handling sign-related cases.

After applying this understanding and correcting the logic,
I was able to successfully complete the solution.
*/


class Solution {
    public int reverse(int x) {

        // IMPORTANT: use long before abs to avoid overflow on Integer.MIN_VALUE
        long num = x;

        boolean negative = num < 0;
        num = Math.abs(num);

        // Convert to string
        String s = Long.toString(num);

        // Reverse string
        String reversedString = new StringBuilder(s).reverse().toString();

        long reversedLong = Long.parseLong(reversedString);

        // Apply sign
        if (negative) {
            reversedLong = -reversedLong;
        }

        // Overflow check
        if (reversedLong > Integer.MAX_VALUE || reversedLong < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) reversedLong;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int x = sc.nextInt();

        Solution solution = new Solution();
        int result = solution.reverse(x);

        System.out.println(result);

        sc.close();
    }
}
