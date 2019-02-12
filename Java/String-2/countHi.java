// February 11th, 2019

// countHi
// Return the number of times that the string "hi" appears anywhere in the given string.

// countHi("abc hi ho") → 1
// countHi("ABChi hi") → 2
// countHi("hihi") → 2

public class countHi {

    public static void main(String[] args) {
        countHi test = new countHi();

        System.out.println(test.countHi("abc hi ho"));
        System.out.println(test.countHi("ABChi hi"));
        System.out.println(test.countHi("hihi"));
    }

    public int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++){
            if (str.substring(i, i+2).equals("hi")){
                count++;
            }
        }

        return count;
    }

}
