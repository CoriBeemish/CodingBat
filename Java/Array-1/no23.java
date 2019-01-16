// Completed on January 15th, 2019

// Given an int array length 2, return true if it does not contain a 2 or 3.

// no23([4, 5]) → true
// no23([4, 2]) → false
// no23([3, 5]) → false

public class no23 {

    public static void main(String[] args) {
        no23 test = new no23();

        System.out.println(test.no23(new int[] {4, 5}));
        System.out.println(test.no23(new int[] {4, 2}));
        System.out.println(test.no23(new int[] {3, 5}));
    }

    public boolean no23(int[] nums) {
        if(nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] == 3){
            return false;
        }
        return true;
    }

}
