// Completed on January 12th, 2019

// Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.

// sum2([1, 2, 3]) → 3
// sum2([1, 1]) → 2
// sum2([1, 1, 1, 1]) → 2

import java.util.Arrays;

public class sum2 {

    public static void main(String[] args) {
        sum2 test = new sum2();

        System.out.println(test.sum2(new int[] {1, 2, 3}));
        System.out.println(test.sum2(new int[] {1, 1}));
        System.out.println(test.sum2(new int[] {1, 1, 1, 1}));
    }

    public int sum2(int[] nums) {
        if (nums.length >= 2) {
            return nums[0] + nums[1];
        }
        else if (nums.length > 0) {
            return nums[0];
        }
        else {
            return 0;
        }
    }

}
