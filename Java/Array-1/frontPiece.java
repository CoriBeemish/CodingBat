// Completed on January 16th, 2019

// Given an int array of any length, return a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.

// frontPiece([1, 2, 3]) → [1, 2]
// frontPiece([1, 2]) → [1, 2]
// frontPiece([1]) → [1]

import java.util.Arrays;

public class frontPiece {

    public static void main(String[] args) {
        frontPiece test = new frontPiece();

        System.out.println(Arrays.toString(test.frontPiece(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(test.frontPiece(new int[]{1, 2})));
        System.out.println(Arrays.toString(test.frontPiece(new int[]{1})));
        System.out.println(Arrays.toString(test.frontPiece(new int[]{})));
    }

    public int[] frontPiece(int[] nums) {

        int[] arr = new int[2];

        if (nums.length >= 2 ){
            arr[0] = nums[0];
            arr[1] = nums[1];
            return arr;
        }

        return nums;

    }

}
