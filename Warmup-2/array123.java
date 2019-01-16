// Completed on January 3rd, 2019

// Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.

// array123([1, 1, 2, 3, 1]) → true
// array123([1, 1, 2, 4, 1]) → false
// array123([1, 1, 2, 1, 2, 3]) → true

public class array123 {

    public static void main(String[] args) {
        array123 test = new array123();

        System.out.println(test.array123(new int[]{1, 1, 2, 3, 1}));
        System.out.println(test.array123(new int[]{1, 1, 2, 4, 1}));
        System.out.println(test.array123(new int[]{1, 1, 2, 1, 2, 3}));
    }

    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums.length > i + 2 && nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }

}
