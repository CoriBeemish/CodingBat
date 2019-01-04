// Completed on January 4th, 2018

// Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.

// atFirst("hello") → "he"
// atFirst("hi") → "hi"
// atFirst("h") → "h@"

public class atFirst {

    public static void main(String[] args) {
        atFirst test = new atFirst();

        System.out.println(test.atFirst("hello"));
        System.out.println(test.atFirst("hi"));
        System.out.println(test.atFirst("h"));

        System.out.println(test.atFirst(""));
    }

    public String atFirst(String str) {
        if(str.length() == 1){
            return str + "@";
        }
        else if( str.length() >= 2){
            return str.substring(0,2);
        }

        return "@" + "@";
    }
}
