// Completed on January 4th, 2019

// Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".

// lastTwo("coding") → "codign"
// lastTwo("cat") → "cta"
// lastTwo("ab") → "ba"

public class lastTwo {

    public static void main(String[] args) {
        lastTwo test = new lastTwo();

        System.out.println(test.lastTwo("coding"));
        System.out.println(test.lastTwo("cat"));
        System.out.println(test.lastTwo("ab"));
    }

    public String lastTwo(String str) {
        String a = "";
        String b = "";
        String rest = "";

        if (str.length() >=2){
            a = str.substring(str.length()-2, str.length()-1);
            b = str.substring(str.length()-1, str.length());
            rest = str.substring(0, str.length()-2);

            return rest + b + a;
        }

        return str;
    }

}
