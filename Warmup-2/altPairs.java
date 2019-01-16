// Completed on January 3rd, 2019

// Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".

// altPairs("kitten") → "kien"
// altPairs("Chocolate") → "Chole"
// altPairs("CodingHorror") → "Congrr"

public class altPairs {

    public static void main(String[] args) {
        altPairs test = new altPairs();

        System.out.println(test.altPairs("kitten"));
        System.out.println(test.altPairs("Chocolate"));
        System.out.println(test.altPairs("CodingHorror"));
    }

    public String altPairs(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i += 4) {
            if (i < str.length()-1)
                result += str.substring(i, i+2);
            else
                result += str.substring(i, i+1);
        }

        return result;

    }

}
