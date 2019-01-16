// Completed on January 16th, 2019

// Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. The array length will be at least 3.

// midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
// midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
// midThree([1, 2, 3]) → [1, 2, 3]

import java.util.Arrays;

public class midThree {

    public static void main(String[] args) {
        swapEnds test = new swapEnds();

        System.out.println(Arrays.toString(test.swapEnds(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(test.swapEnds(new int[]{8, 6, 7, 5, 3, 0, 9})));
        System.out.println(Arrays.toString(test.swapEnds(new int[]{1, 2, 3})));
    }

    public int[] midThree(int[] nums) {
        int[] middle = new int[3];
        int half = nums.length / 2;
        middle[0] = nums[half-1];
        middle[1] = nums[half];
        middle[2] = nums[half+1];
        return middle;
    }

}
