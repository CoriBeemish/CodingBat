// Completed on January 3rd, 2018

// Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.

// stringYak("yakpak") → "pak"
// stringYak("pakyak") → "pak"
// stringYak("yak123ya") → "123ya"

public class stringYak {
    public static void main(String[] args) {
        stringYak test = new stringYak();

        System.out.println(test.stringYak("yakpak"));
        System.out.println(test.stringYak("pakyak"));
        System.out.println(test.stringYak("yak123ya"));
    }

    public String stringYak(String str) {
        String result = "";

        result = str.replaceAll("yak", "");

        return result;
    }

}
