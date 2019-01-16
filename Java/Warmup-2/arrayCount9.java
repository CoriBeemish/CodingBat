// Completed on January 3rd, 2019

// Given an array of ints, return the number of 9's in the array.

// arrayCount9([1, 2, 9]) → 1
// arrayCount9([1, 9, 9]) → 2
// arrayCount9([1, 9, 9, 3, 9]) → 3

public class arrayCount9 {

    public static void main(String[] args) {
        arrayCount9 test = new arrayCount9();

        System.out.println(test.arrayCount9(new int[]{1, 2, 9}));
        System.out.println(test.arrayCount9(new int[]{1, 9, 9}));
        System.out.println(test.arrayCount9(new int[]{1, 9, 9, 3, 9}));
    }

    public int arrayCount9(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 9){
                count++;
            }
        }

        return count;
    }
}

