// Completed on January 7th, 2019

// Return true if the given non-negative number is 1 or 2 more than a multiple of 20. See also: Introduction to Mod

// more20(20) → false
// more20(21) → true
// more20(22) → true

public class more20 {

    public static void main(String[] args) {
        more20 test = new more20();

        System.out.println(test.more20(20));
        System.out.println(test.more20(21));
        System.out.println(test.more20(22));
    }

    public boolean more20(int n) {
        if(n % 20 == 1 || n % 20 == 2){
            return true;
        }

        return false;
    }

}
