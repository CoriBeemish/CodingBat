// Completed on January 3rd, 2019

// Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

// firstHalf("WooHoo") → "Woo"
// firstHalf("HelloThere") → "Hello"
// firstHalf("abcdef") → "abc"

public class firstHalf {

    public static void main(String[] args) {
        firstHalf test = new firstHalf();

        System.out.println(test.firstHalf("WooHoo"));
        System.out.println(test.firstHalf("HelloThere"));
        System.out.println(test.firstHalf("abcdef"));
    }

    public String firstHalf(String str) {
        return (str.substring(0, str.length() / 2));
    }
}
