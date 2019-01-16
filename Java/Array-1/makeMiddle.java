// Completed on January 15th, 2019

// Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array. The original array will be length 2 or more.

// makeMiddle([1, 2, 3, 4]) → [2, 3]
// makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
// makeMiddle([1, 2]) → [1, 2]

import java.util.Arrays;

public class makeMiddle {

    public static void main(String[] args) {
        makeMiddle test = new makeMiddle();

        System.out.println(Arrays.toString(test.makeMiddle(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(test.makeMiddle(new int[]{7, 1, 2, 3, 4, 9})));
        System.out.println(Arrays.toString(test.makeMiddle(new int[]{1, 2})));
    }

    public int[] makeMiddle(int[] nums) {
        int[] middle = new int[2];
        int half = nums.length / 2;
        middle[0] = nums[half-1];
        middle[1] = nums[half];
        return middle;
    }

}
