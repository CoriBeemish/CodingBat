// Completed on February 11th, 2019

// xyBalance
// We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.

// xyBalance("aaxbby") → true
// xyBalance("aaxbb") → false
// xyBalance("yaaxbb") → false

public class xyBalance {

    public static void main(String[] args) {
        xyBalance test = new xyBalance();

        System.out.println(test.xyBalance("aaxbby"));
        System.out.println(test.xyBalance("aaxbb"));
        System.out.println(test.xyBalance("yaaxbb"));
    }

    public boolean xyBalance(String str) {
        if ((str.lastIndexOf("y") > str.lastIndexOf("x"))) {
            return true;
        }
        if (str.indexOf("x") == str.indexOf("y")) {
            return true;
        }
        return false;
    }

}
