// Completed on January 3rd, 2018

// Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.

// firstTwo("Hello") → "He"
// firstTwo("abcdefg") → "ab"
// firstTwo("ab") → "ab"

public class firstTwo {

    public static void main(String[] args) {
        firstTwo test = new firstTwo();

        System.out.println(test.firstTwo("Hello"));
        System.out.println(test.firstTwo("ab"));
        System.out.println(test.firstTwo("Hi"));
    }

    public String firstTwo(String str) {
        if (str.length() <= 2){
            return str;
        }

        String first = str.substring(0,2);
        return first;
    }

}
