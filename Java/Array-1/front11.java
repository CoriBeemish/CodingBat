// Completed on January 16th, 2019

// Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. If either array is length 0, ignore that array.

// front11([1, 2, 3], [7, 9, 8]) → [1, 7]
// front11([1], [2]) → [1, 2]
// front11([1, 7], []) → [1]

import java.util.Arrays;

public class front11 {

    public static void main(String[] args) {
        front11 test = new front11();

        System.out.println(Arrays.toString(test.front11(new int[]{1, 2, 3}, new int[]{7, 9, 8})));
        System.out.println(Arrays.toString(test.front11(new int[]{1}, new int[]{2})));
        System.out.println(Arrays.toString(test.front11(new int[]{1, 7}, new int[]{})));
    }

    public int[] front11(int[] a, int[] b) {
        if (a.length >=1 && b.length >=1){
            int[] c = {a[0], b[0]};
            return c;
        }
        else if(a.length == 0 && b.length >= 1){
            int[] c = {b[0]};
            return c;
        }
        else if (a.length >= 1 && b.length ==0){
            int[] c = {a[0]};
            return c;
        }

        return a;
    }

}
