// Completed on January 15th, 2019

// Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. Return the array which has the largest sum. In event of a tie, return a.

// biggerTwo([1, 2], [3, 4]) → [3, 4]
// biggerTwo([3, 4], [1, 2]) → [3, 4]
// biggerTwo([1, 1], [1, 2]) → [1, 2]

public class biggerTwo {

    public static void main(String[] args) {
        biggerTwo test = new biggerTwo();

        System.out.println((test.biggerTwo(new int[]{1, 2}, new int[]{3, 4})));
        System.out.println((test.biggerTwo(new int[]{3, 4}, new int[]{1, 2})));
        System.out.println((test.biggerTwo(new int[]{1, 1}, new int[]{1, 2})));
    }

    public int[] biggerTwo(int[] a, int[] b) {
        if(a[0] + a[1] < b[0] + b[1]){
            return b;
        }
        return a;
    }

}
