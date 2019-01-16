// Completed on January 3rd, 2019

// Given a string and an index, return a string length 2 starting at the given index. If the index is too big or too small to define a string length 2, use the first 2 chars. The string length will be at least 2.

// twoChar("java", 0) = "ja"
// twoChar("java", 2) = "va"
// twoChar("java", 3) = "ja"

public class twoChar {

    public static void main(String[] args) {
        twoChar test = new twoChar();

        System.out.println(test.twoChar("java", 0));
        System.out.println(test.twoChar("java", 2));
        System.out.println(test.twoChar("java", 3));
    }

    public String twoChar(String str, int index) {
        if(index <= str.length()-2 && index >= 0){
            return str.substring(index, index+2);
        }
        return str.substring(0, 2);
    }
}
