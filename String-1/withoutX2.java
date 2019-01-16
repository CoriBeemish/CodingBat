// Completed on January 4th, 2019

// Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.

// withoutX2("xHi") → "Hi"
// withoutX2("Hxi") → "Hi"
// withoutX2("Hi") → "Hi"

public class withoutX2 {

    public static void main(String[] args) {
        withoutX2 test = new withoutX2();

        System.out.println(test.withoutX2("xHix"));
        System.out.println(test.withoutX2("xHi"));
        System.out.println(test.withoutX2("Hxix"));
        System.out.println(test.withoutX2("Hix"));
        System.out.println(test.withoutX2("xaxb"));

    }

    public String withoutX2(String str) {
        if (str.length() > 0 && str.charAt(0) == 'x') {
            str = str.substring(1);
            if (str.length() > 0 && str.charAt(0) == 'x') {
                str = str.substring(1);
            }
        } else if (str.length() > 0 && str.charAt(1) == 'x') {
            str = str.substring(0, 1) + str.substring(2);
        }
        return str;
    }

}
