// Completed on January 4th, 2019

// Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.

// deFront("Hello") → "llo"
// deFront("java") → "va"
// deFront("away") → "aay"

public class deFront {

    public static void main(String[] args) {
        deFront test = new deFront();

        System.out.println(test.deFront("Hello"));
        System.out.println(test.deFront("java"));
        System.out.println(test.deFront("away"));
        System.out.println(test.deFront("a"));
        System.out.println(test.deFront(""));
    }

    public String deFront(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        if (str.length() >= 2){
            if(str.charAt(0) == 'a'){
                stringBuilder.append('a');
            }
            if(str.charAt(1) == 'b'){
                stringBuilder.append('b');
            }
            stringBuilder.append(str.substring(2));
            return stringBuilder.toString();
        }
        else if(str.length() == 1 && str.charAt(0) == 'a'){
            return "a";
        }
        else {
            return "";
        }
    }

}
