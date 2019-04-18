// FILE: oneTwo.java

// Completed on April 17th, 2019

// Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.

// oneTwo("abc") → "bca"
// oneTwo("tca") → "cat"
// oneTwo("tcagdo") → "catdog"

public class oneTwo {

    public static void main(String[] args) {
        oneTwo test = new oneTwo();

        System.out.println(test.oneTwo("abc"));
        System.out.println(test.oneTwo("tca"));
        System.out.println(test.oneTwo("tcagdo"));
    }

    public String oneTwo(String str) {
        String string = "";
        for (int i = 0; i < str.length() - 2; i+= 3){
            string += str.substring(i+1, i+3) + str.charAt(i);
        }
        return string;
    }

}
