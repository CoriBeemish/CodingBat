// Completed on January 3rd, 2019

// Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.

// withoutEnd("Hello") → "ell"
// withoutEnd("java") → "av"
// withoutEnd("coding") → "odin"

public class withoutEnd {

    public static void main(String[] args) {
        withoutEnd test = new withoutEnd();

        System.out.println(test.withoutEnd("Hello"));
        System.out.println(test.withoutEnd("java"));
        System.out.println(test.withoutEnd("coding"));
    }

    public String withoutEnd(String str) {
        return str.substring(1, str.length()-1);
    }
}
