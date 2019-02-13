// Completed on February 12th, 2018

// repeatSeparator
// Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.

// repeatSeparator("Word", "X", 3) → "WordXWordXWord"
// repeatSeparator("This", "And", 2) → "ThisAndThis"
// repeatSeparator("This", "And", 1) → "This"

public class repeatSeparator {

    public static void main(String[] args) {
        repeatSeparator test = new repeatSeparator();

        System.out.println(test.repeatSeparator("Word", "X", 3));
        System.out.println(test.repeatSeparator("This", "And", 2));
        System.out.println(test.repeatSeparator("This", "And", 1));
    }

    public String repeatSeparator(String word, String sep, int count) {
        String result = "";
        for(int i = 0; i < count; i++){
            result = result + word + sep;
        }
        return result.substring(0,result.length()-sep.length());
    }

}
