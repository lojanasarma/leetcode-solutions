
package Is_Power_Of_Three_Q326_Easy;

/*
This question is similar to isPowerOfTwo (Q231) and isPowerOfFour (Q342).
Here, we need to check for a power of three,
so I used the same logic to solve this problem.
*/

class Solution {
    public boolean isPowerOfThree(int n) {

        boolean isPower = false;

        for(int i=0;i<31;i++){

            long result = (long) Math.pow(3,i);

            if(result == n){

                isPower = true;
                break;//Stop once found

            }

        }

        return isPower;

    }
}