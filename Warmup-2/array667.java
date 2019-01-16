// Completed on January 3rd, 2019

// Given an array of ints, return the number of times that two 6's are next to each other in the array. Also count instances where the second "6" is actually a 7.

// array667([6, 6, 2]) → 1
// array667([6, 6, 2, 6]) → 1
// array667([6, 7, 2, 6]) → 1

public class array667 {

    public static void main(String[] args) {
        array667 test = new array667();

        System.out.println(test.array667(new int[]{6, 6, 2}));
        System.out.println(test.array667(new int[]{6, 6, 2, 6}));
        System.out.println(test.array667(new int[]{6, 7, 2, 6}));
    }

    public int array667(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++ ){
            if(nums.length > i+1 && nums[i] == 6 && nums[i+1] == 6){
                count++;
            }else if(nums.length > i+1 && nums[i] == 6 && nums[i+1] == 7 ){
                count++;
            }
        }

        return count;
    }

}
