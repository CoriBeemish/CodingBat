// Completed on January 3rd, 2019

// Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.

// arrayFront9([1, 2, 9, 3, 4]) → true
// arrayFront9([1, 2, 3, 4, 9]) → false
// arrayFront9([1, 2, 3, 4, 5]) → false

public class arrayFront9 {

    public static void main(String[] args) {
        arrayFront9 test = new arrayFront9();

        System.out.println(test.arrayFront9(new int[]{1, 2, 9, 3, 4}));
        System.out.println(test.arrayFront9(new int[]{1, 2, 3, 4, 9}));
        System.out.println(test.arrayFront9(new int[]{1, 2, 3, 4, 5}));
    }

    public boolean arrayFront9(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9 && i < 4) {
                return true;
            }
        }
        return false;
    }

}
