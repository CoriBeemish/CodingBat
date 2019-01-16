// Completed on January 3rd, 2019

// Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.

// nonStart("Hello", "There") → "ellohere"
// nonStart("java", "code") → "avaode"
// nonStart("shotl", "java") → "hotlava"

public class nonStart {

    public static void main(String[] args) {
        nonStart test = new nonStart();

        System.out.println(test.nonStart("Hello", "There"));
        System.out.println(test.nonStart("java", "code"));
        System.out.println(test.nonStart("shotl", "java"));
    }

    public String nonStart(String a, String b) {
        String start1 = a.substring(1);
        String start2 =b.substring(1);
        return start1 + start2;
    }
}
