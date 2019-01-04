// Completed on January 4th, 2018

// Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.

// hasBad("badxx") → true
// hasBad("xbadxx") → true
// hasBad("xxbadxx") → false

public class hasBad {

    public static void main(String[] args) {
        hasBad test = new hasBad();

        System.out.println(test.hasBad("badxx"));
        System.out.println(test.hasBad("xbadxx"));
        System.out.println(test.hasBad("xxbadxx"));

        System.out.println(test.hasBad("code"));
        System.out.println(test.hasBad("xba"));
        System.out.println(test.hasBad(""));
    }

    public boolean hasBad(String str) {
        if( str.indexOf("bad") <=1 && str.contains("bad") ){
            return true;
        }
        return false;
    }

}
