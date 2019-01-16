// Completed on January 4th, 2019

// Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".

// conCat("abc", "cat") → "abcat"
// conCat("dog", "cat") → "dogcat"
// conCat("abc", "") → "abc"

public class conCat {

    public static void main(String[] args) {
        conCat test = new conCat();

        System.out.println(test.conCat("abc", "cat"));
        System.out.println(test.conCat("dog", "cat"));
        System.out.println(test.conCat("abc", ""));
    }

    public String conCat(String a, String b) {
        if(a.length() == 0 || b.length() == 0){
            return a + b;
        }

        if (a.charAt(a.length()-1) == b.charAt(0)){
            return a + b.substring(1);
        }

        return a + b;
    }

}
