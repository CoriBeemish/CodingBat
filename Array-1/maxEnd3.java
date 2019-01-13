// Completed on January 12th, 2019

// Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.

// maxEnd3([1, 2, 3]) → [3, 3, 3]
// maxEnd3([11, 5, 9]) → [11, 11, 11]
// maxEnd3([2, 11, 3]) → [3, 3, 3]

import java.util.Arrays;

public class maxEnd3 {

    public static void main(String[] args) {
        maxEnd3 test = new maxEnd3();

        System.out.println(Arrays.toString(test.maxEnd3(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(test.maxEnd3(new int[]{5, 11, 9})));
        System.out.println(Arrays.toString(test.maxEnd3(new int[]{2, 11, 3})));
    }

    public int[] maxEnd3(int[] nums) {
        int max = Math.max(nums[0], nums[nums.length - 1]);
        return new int[] {max, max, max};
    }

}
