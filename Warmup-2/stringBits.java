// Completed on January 3rd, 2019

// Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".

// stringBits("Hello") → "Hlo"
// stringBits("Hi") → "H"
// stringBits("Heeololeo") → "Hello"

public class stringBits {

    public static void main(String[] args) {
        stringBits test = new stringBits();

        System.out.println(test.stringBits("Hello"));
        System.out.println(test.stringBits("Hi"));
        System.out.println(test.stringBits("Heeololeo"));
    }

    public String stringBits(String str) {
        String result = "";
        int n = 2;
        for (int i = 0; i < str.length(); i = i + n){
            result = result + str.charAt(i);
        }

        return result;
    }

}
