// Completed on January 3rd, 2018

// Given a non-empty string like "Code" return a string like "CCoCodCode".

// stringSplosion("Code") → "CCoCodCode"
// stringSplosion("abc") → "aababc"
// stringSplosion("ab") → "aab"

// (This is horribly worded.)

public class stringSplosion {

    public static void main(String[] args) {
        stringSplosion test = new stringSplosion();

        System.out.println(test.stringSplosion("Code"));
        System.out.println(test.stringSplosion("abc"));
        System.out.println(test.stringSplosion("ab"));
    }

    public String stringSplosion(String str) {
        String result = "";

        for (int i = 0; i <= str.length(); i++){
            result = result + str.substring(0,i);
        }

        return result;
    }


}
