// Completed on January 4th, 2019

// Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.

// middleThree("Candy") → "and"
// middleThree("and") → "and"
// middleThree("solving") → "lvi"

public class middleThree {

    public static void main(String[] args) {
        middleThree test = new middleThree();

        System.out.println(test.middleThree("Candy"));
        System.out.println(test.middleThree("and"));
        System.out.println(test.middleThree("solving"));
    }

    public String middleThree(String str) {
        if(str.length() <= 3){
            return str;
        }
        int middle = str.length() / 2;
        return str.substring(middle - 1, middle + 2);
    }

}
