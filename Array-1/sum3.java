// Completed on January 12th, 2019

// Given an array of ints length 3, return the sum of all the elements.

// sum3([1, 2, 3]) → 6
// sum3([5, 11, 2]) → 18
// sum3([7, 0, 0]) → 7

public class sum3 {

    public static void main(String[] args) {
        sum3 test = new sum3();

        System.out.println(test.sum3(new int[] {1, 2, 3}));
        System.out.println(test.sum3(new int[] {5, 11, 2}));
        System.out.println(test.sum3(new int[] {7, 0, 0}));
    }

    public int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }

}
