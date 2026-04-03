package TwoSum_Q1;

import java.util.Scanner;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        for(int i=0;i<nums.length;i++){

            for(int j=i+1;j<nums.length;j++){

                if(nums[i]+nums[j]==target){

                    return new int[]{i,j};

                }

            }

        }

        return new int[]{-1, -1}; // if not found

    }



    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an array size : ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements to store in Array : ");

        for(int i = 0;i<n;i++){

            nums[i] = sc.nextInt();

        }

        System.out.println("Enter a target : ");
        int target = sc.nextInt();


        //Object
        Solution solution = new Solution();

        int[] result = solution.twoSum(nums,target);

        System.out.print("Input : Nums : ");
        for(int i =0;i<n;i++){

            System.out.print(nums[i]+" ");

        }

        System.out.println("Target : "+target);

        System.out.println("Output : "+nums);

    }

}
