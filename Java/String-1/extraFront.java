// Completed on January 4th, 2019

// Given a string, return a new string made of 3 copies of the first 2 chars of the original string. The string may be any length. If there are fewer than 2 chars, use whatever is there.

// extraFront("Hello") → "HeHeHe"
// extraFront("ab") → "ababab"
// extraFront("H") → "HHH"

public class extraFront {

    public static void main(String[] args) {
        extraFront test = new extraFront();

        System.out.println(test.extraFront("Hello"));
        System.out.println(test.extraFront("ab"));
        System.out.println(test.extraFront("H"));
    }

    public String extraFront(String str) {
        if (str.length() >= 2){
            String front = str.substring(0,2);
            return front + front + front;
        }
        return str + str + str;
    }

}
