// Completed on February 12th, 2018

// repeatEnd
// Given a string and an int n, return a string made of n repetitions of the last n characters of the string. You may assume that n is between 0 and the length of the string, inclusive.

// repeatEnd("Hello", 3) → "llollollo"
// repeatEnd("Hello", 2) → "lolo"
// repeatEnd("Hello", 1) → "o"

public class repeatEnd {

    public static void main(String[] args) {
        repeatEnd test = new repeatEnd();

        System.out.println(test.repeatEnd("Hello", 3));
        System.out.println(test.repeatEnd("Hello", 2));
        System.out.println(test.repeatEnd("Hello", 1));
    }

    public String repeatEnd(String str, int n) {
        String result = "";
        for (int i =0; i < n; i++){
            result = result + str.substring(str.length() - n, str.length());
        }
        return result;
    }

}
