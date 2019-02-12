// Completed on February 11th, 2019

// bobThere
// Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.

// bobThere("abcbob") → true
// bobThere("b9b") → true
// bobThere("bac") → false

public class bobThere {

    public static void main(String[] args) {
        bobThere test = new bobThere();

        System.out.println(test.bobThere("abcbob"));
        System.out.println(test.bobThere("b9b"));
        System.out.println(test.bobThere("bac"));
    }

    public boolean bobThere(String str) {
        for(int i =0; i < str.length() - 2; i++){
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b'){
                return true;
            }

        }
        return false;
    }

}
