
package First_Missing_Positive_Q41_Hard;

/*
 In Java, you can use the built-in method Arrays.sort() from the Java Standard Library(Arrays) to sort arrays quickly and efficiently.

 - Default sorting order: ascending (small → large)
 - Works for:
     * primitives (int[], double[], etc.)
     * objects (String[], Integer[], etc.)
*/
import java.util.Arrays;

class Solution {
    public int firstMissingPositive(int[] nums) {

        int n = nums.length;
        int missing = 1;

        //Initally unsorted so need to sort
        Arrays.sort(nums);

        for(int  i=0;i<n;i++){

            if(nums[i] == missing){

                missing++;

            }

        }

        return missing;

    }
}
