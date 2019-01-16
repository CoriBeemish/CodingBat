// Completed on January 7th, 2019

// Return true if the given non-negative number is a multiple of 3 or 5, but not both. Use the % "mod" operator -- see Introduction to Mod

// old35(3) → true
// old35(10) → true
// old35(15) → false

public class old35 {

    public static void main(String[] args) {
        old35 test = new old35();

        System.out.println(test.old35(3));
        System.out.println(test.old35(10));
        System.out.println(test.old35(15));
    }

    public boolean old35(int n) {
        if(n%3 == 0 && n%5 == 0){
            return false;
        }

        else if(n%3 == 0 || n%5 == 0){
            return true;
        }

        return false;
        // return (n % 3 == 0) != (n % 5 == 0);
    }

}
