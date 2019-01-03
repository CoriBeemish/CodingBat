// Completed on January 3rd, 2018

// Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.

// right2("Hello") → "loHel"
// right2("java") → "vaja"
// right2("Hi") → "Hi"

public class right2 {

    public static void main(String[] args) {
        right2 test = new right2();

        System.out.println(test.right2("Hello"));
        System.out.println(test.right2("java"));
        System.out.println(test.right2("Hi"));
    }

    public String right2(String str) {
        if (str.length() <=2){
            return str;
        }
        String start = str.substring(0, str.length() - 2);
        String end = str.substring(str.length() - 2);
        return end + start;
    }

}
