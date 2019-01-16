// Completed on January 16th, 2019

// Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a followed by the elements from b. The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays.

// make2([4, 5], [1, 2, 3]) → [4, 5]
// make2([4], [1, 2, 3]) → [4, 1]
// make2([], [1, 2]) → [1, 2]

import java.util.Arrays;

public class make2 {

    public static void main(String[] args) {
        make2 test = new make2();

        System.out.println(Arrays.toString(test.make2(new int[]{4, 5}, new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(test.make2(new int[]{1, 2}, new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(test.make2(new int[]{}, new int[]{1,2})));
    }

    public int[] make2(int[] a, int[] b) {
        int[] arr = new int[2];
        if(a.length >= 2)
        {
            arr[0] = a[0];
            arr[1] = a[1];
        }
        else if(a.length == 1)
        {
            arr[0] = a[0];
            arr[1] = b[0];
        }
        else
        {
            arr[0] = b[0];
            arr[1] = b[1];
        }
        return arr;

    }

}
