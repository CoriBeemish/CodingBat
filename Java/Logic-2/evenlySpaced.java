// FILE: evenlySpaced.java

// Completed on April 9th, 2019

// Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large.

// evenlySpaced(2, 4, 6) → true
// evenlySpaced(4, 6, 2) → true
// evenlySpaced(4, 6, 3) → false

public class evenlySpaced {

    public static void main(String[] args) {
        evenlySpaced test = new evenlySpaced();

        System.out.println(test.evenlySpaced(2, 4, 6));
        System.out.println(test.evenlySpaced(4, 6, 2));
        System.out.println(test.evenlySpaced(4, 6, 3));
    }

    public boolean evenlySpaced(int a, int b, int c) {
        if(a==b && b==c){
            return true;
        }

        if(a==b || a==c || b==c) {
            return false;
        }

        return ((Math.abs(a-b)== Math.abs(b-c)) || (Math.abs(a-c)==Math.abs(a-b)) ||( Math.abs(c-a)==Math.abs(b-c)));
    }

}
