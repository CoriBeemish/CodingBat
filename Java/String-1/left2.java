// Completed on January 3rd, 2019

// Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.

// left2("Hello") → "lloHe"
// left2("java") → "vaja"
// left2("Hi") → "Hi"

public class left2 {

    public static void main(String[] args) {
        left2 test = new left2();

        System.out.println(test.left2("Hello"));
        System.out.println(test.left2("java"));
        System.out.println(test.left2("Hi"));
    }

    public String left2(String str) {
        if (str.length() <=2){
            return str;
        }
        String left = str.substring(2);
        String right = str.substring(0,2);
        return left + right;
    }
}
