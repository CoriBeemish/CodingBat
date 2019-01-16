// Completed on January 4th, 2019

// Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.

// minCat("Hello", "Hi") → "loHi"
// minCat("Hello", "java") → "ellojava"
// minCat("java", "Hello") → "javaello"

public class minCat {

    public static void main(String[] args) {
        minCat test = new minCat();

        System.out.println(test.minCat("Hello", "Hi"));
        System.out.println(test.minCat("Hello", "java"));
        System.out.println(test.minCat("java", "Hello"));
    }
    public String minCat(String a, String b) {
        if(a.length() > b.length()){
            return a.substring(a.length() - b.length(), a.length()) + b;
        }
        return a + b.substring(b.length() - a.length(), b.length());
    }

}
