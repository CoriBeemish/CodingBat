// Completed on January 15th, 2019

// Given an array of ints, return a new array length 2 containing the first and last elements from the original array. The original array will be length 1 or more.

// makeEnds([1, 2, 3]) → [1, 3]
// makeEnds([1, 2, 3, 4]) → [1, 4]
// makeEnds([7, 4, 6, 2]) → [7, 2]

import java.util.Arrays;

public class makeEnds {

    public static void main(String[] args) {
        makeEnds test = new makeEnds();

        System.out.println(Arrays.toString(test.makeEnds(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(test.makeEnds(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(test.makeEnds(new int[]{7, 4, 6, 2})));
    }

    public int[] makeEnds(int[] nums) {
        int[] temp = { nums[0], nums[nums.length-1] };
        return temp;
    }

}
