
package Valid_Perfect_Square_Q367_Easy;

/*
We multiply 46340 * 46340.

46340 is the largest integer such that its square does not overflow a 32-bit signed integer.

46340 * 46340 = 2147395600 (valid, within int range)
46341 * 46341 would overflow.

This is similar to logic used in:
- Power of Two (#231)
- Power of Three (#326)
- Power of Four (#342)

Where we rely on boundary limits and properties of numbers to avoid overflow.
*/

class Solution {
    public boolean isPerfectSquare(int num) {

        int x = (int) (Math.pow(2,31)-1);

        int n = (int)Math.sqrt(x);

        for (int i = 0; i <= n; i++) {
            int square = i * i;

            if (square == num) {
                return true;
            }

            if (square > num) {
                break;
            }
        }

        return false;
    }
}