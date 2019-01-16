// Completed on January 3rd, 2019

// Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.

// stringMatch("xxcaazz", "xxbaaz") → 3
// stringMatch("abc", "abc") → 2
// stringMatch("abc", "axc") → 0

public class stringMatch {

    public static void main(String[] args) {
        stringMatch test = new stringMatch();

        System.out.println(test.stringMatch("xxcaazz", "xxbaaz"));
        System.out.println(test.stringMatch("abc", "abc"));
        System.out.println(test.stringMatch("abc", "axc"));
    }

    public int stringMatch(String a, String b) {
        int count = 0;

        for (int i = 0; (i<a.length()-1 && i<b.length()-1); i++){
            if(a.charAt(i)==b.charAt(i) && a.charAt(i+1)==b.charAt(i+1)){
                count++;
            }
        }

        return count;
    }
}
