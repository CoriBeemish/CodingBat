// Completed on January 3rd, 2018

// Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.

// withouEnd2("Hello") → "ell"
// withouEnd2("abc") → "b"
// withouEnd2("ab") → ""

public class withouEnd2 {

    public static void main(String[] args) {
        withouEnd2 test = new withouEnd2();

        System.out.println(test.withouEnd2("Hello"));
        System.out.println(test.withouEnd2("abc"));
        System.out.println(test.withouEnd2("ab"));
    }

    public String withouEnd2(String str) {
        if(str.length() <= 2){
            return "";
        }
        return str.substring(1, str.length() - 1);
    }
}
