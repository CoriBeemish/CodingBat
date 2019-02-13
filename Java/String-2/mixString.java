// Completed on February 12th, 2018

// mixString
// Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.

// mixString("abc", "xyz") → "axbycz"
// mixString("Hi", "There") → "HTihere"
// mixString("xxxx", "There") → "xTxhxexre"

public class mixString {

    public static void main(String[] args) {
        mixString test = new mixString();

        System.out.println(test.mixString("abc", "xyz"));
        System.out.println(test.mixString("Hi", "There"));
        System.out.println(test.mixString("xxxx", "There"));
    }

    public String mixString(String a, String b) {
        String result = "";
        int min = Math.min(a.length(), b.length());
        for (int i = 0; i < min; i++){
            result = result + a.charAt(i) + b.charAt(i);
        }

        if (a.length() >= b.length()){
            result = result + a.substring(b.length(), a.length());
        }

        if (b.length() >= a.length()){
            result = result + b.substring(a.length(), b.length());
        }
        return result;
    }

}
