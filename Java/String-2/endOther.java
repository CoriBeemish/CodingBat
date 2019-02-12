// Completed on February 11th, 2019

// endOther
// Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.

// endOther("Hiabc", "abc") → true
// endOther("AbC", "HiaBc") → true
// endOther("abc", "abXabc") → true

public class endOther {

    public static void main(String[] args) {
        endOther test = new endOther();

        System.out.println(test.endOther("Hiabc", "abc"));
        System.out.println(test.endOther("AbC", "HiaBc"));
        System.out.println(test.endOther("abc", "abXabc"));
    }

    public boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        return a.endsWith( b ) || b.endsWith( a );
    }

}
