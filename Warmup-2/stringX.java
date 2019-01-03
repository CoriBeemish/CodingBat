// Completed on January 3rd, 2018

// Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.

// stringX("xxHxix") → "xHix"
// stringX("abxxxcd") → "abcd"
// stringX("xabxxxcdx") → "xabcdx"

public class stringX {

    public static void main(String[] args) {
        stringX test = new stringX();

        System.out.println(test.stringX("xxHxix"));
        System.out.println(test.stringX("abxxxcd"));
        System.out.println(test.stringX("xabxxxcdx"));
    }

    public String stringX(String str) {
        String middle;

        if (str.length() < 3){
            return str;
        }

        middle = str.substring(1,str.length()-1).replaceAll("x", "");

        return str.charAt(0) + middle + str.charAt(str.length()-1);
    }
}
