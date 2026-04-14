
package Single_Number_Q136_Easy;

/*
Thinking Process:

- By reading the question, I got the idea to use a nested for loop and a count variable.

- The outer loop will go through each element in the array one by one.

- For each element, the inner loop will check how many times that number appears in the entire array.

- If the same number is found, increase the count by 1.

- After checking all elements, if the count is equal to 1,
  it means the number appears only once.

- So, return that number as the answer.
*/
class Solution {
    public int singleNumber(int[] nums) {

        for(int i=0;i<nums.length;i++){

            int count = 0;

            for(int j=0;j<nums.length;j++){

                if(nums[i] == nums[j]){

                    count++;

                }

            }

            if(count == 1){

                return nums[i];

            }

        }

        return -1;

    }
}
