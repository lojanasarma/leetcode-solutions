
package Contains_Duplicate_Q217_Easy;

/*
 * Thinking Process:
 *
 * Step 1: Sort the array using Arrays.sort()
 *         - This brings all equal elements next to each other.
 *
 * Step 2: Traverse the array from index 1 to end
 *         - Compare current element with previous element.
 *
 * Step 3: If nums[i] == nums[i - 1]
 *         - It means a duplicate exists in the array.
 *         - Return true immediately.
 *
 * Step 4: If no duplicates found after full traversal
 *         - Return false.
 *
 * Time Complexity: O(n log n) due to sorting
 * Space Complexity: O(1) (if ignoring sorting space)
 */

import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }

        return false;
    }
}