package Search_Insert_Position_Q35_Easy;

/*
Intuition - Search Insert Position

At first, I thought of solving it like this:
- If target == nums[i], return i
- Otherwise, check if target lies between neighbors:
  nums[i - 1] < target < nums[i + 1], then return i + 1

But this approach is not reliable because:
- It depends on accessing previous/next elements
- It breaks at boundary cases (i = 0 or i = n - 1)

Final Insight:

A simpler and correct idea is:
- If target <= nums[i], return i

Why this works:
- If nums[i] == target → return i (element found)
- If nums[i] > target → target should be inserted before nums[i]
- This automatically handles correct insertion position

If we never find such an index, it means:
- target is greater than all elements
- so return nums.length (insert at end)
*/
import java.util.Scanner;

public class Search_Insert_Position_Q35_Easy {

        public int searchInsert(int[] nums, int target) {

            for(int i=0;i<nums.length;i++){

                if(target <= nums[i]){

                    return i;

                }

            }

            return nums.length;

        }

        public static void main(String[] args) {

            //Crating Scanner object to get an user input from keyboard
            Scanner sc = new Scanner(System.in);

            //Getting user input for Array Size
            System.out.println("Enter the Size of the Array : ");
            int n = sc.nextInt();

            //Allocating Array with Size n
            int[] nums = new int[n];

            //Getting n number of inputs for Array
            for(int i=0;i<nums.length;i++){

                nums[i] = sc.nextInt();

            }

            //Getting target input to return the index if the target is found, if not,return the index where it would be if it were inserted in order
            System.out.println("Enter the target value : ");
            int target = sc.nextInt();

            //Closing Scanner object
            sc.close();

            // Creating an object of Search_Insert_Position_Q35_Easy class to call the searchInsert method
            Search_Insert_Position_Q35_Easy solution = new Search_Insert_Position_Q35_Easy();

            // Calling searchInsert method and storing the returned index result
            int result = solution.searchInsert(nums, target);

            //Output
            System.out.println(result);

        }

    }

