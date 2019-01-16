// Completed on January 15th, 2019

// Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.

// double23([2, 2]) → true
// double23([3, 3]) → true
// double23([2, 3]) → false

public class double23 {

    public static void main(String[] args) {
        double23 test = new double23();

        System.out.println(test.double23(new int[] {2, 2}));
        System.out.println(test.double23(new int[] {3, 3}));
        System.out.println(test.double23(new int[] {2, 3}));
    }

    public boolean double23(int[] nums) {
        int count2 = 0;
        int count3 = 0;

        for(int i= 0; i < nums.length; i++){
            if (nums[i] == 2){
                count2++;
            }

            if (nums[i] == 3){
                count3++;
            }
        }
        return count2 == 2 || count3 == 2;
    }

}
