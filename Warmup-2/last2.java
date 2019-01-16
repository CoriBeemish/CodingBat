// Completed on January 3rd, 2019

// Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).

// last2("hixxhi") → 1
// last2("xaxxaxaxx") → 1
// last2("axxxaaxx") → 2

public class last2 {

    public static void main(String[] args) {
        last2 test = new last2();

        System.out.println(test.last2("hixxhi"));
        System.out.println(test.last2("xaxxaxaxx"));
        System.out.println(test.last2("axxxaaxx"));
    }

    public int last2(String str) {
        int count = 0;
        String end = "";

        if (str.length() > 1){
            end = str.substring(str.length() - 2);
        }

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.indexOf(end, i) == i) {
                count++;
            }
        }

        return count;
    }



}
