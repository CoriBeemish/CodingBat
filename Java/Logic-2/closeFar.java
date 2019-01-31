// Completed on January 31st, 2019

// Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a number.

// closeFar(1, 2, 10) → true
// closeFar(1, 2, 3) → false
// closeFar(4, 1, 3) → true

public class closeFar {

    public static void main(String[] args) {
        closeFar test = new closeFar();

        System.out.println(test.closeFar(16, 17, 18));
        System.out.println(test.closeFar(12, 13, 14));
        System.out.println(test.closeFar(6, 4, 4));
    }

    public boolean closeFar(int a, int b, int c) {
        return true;
    }

}
