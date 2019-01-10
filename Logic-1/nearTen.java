// Completed on January 10th, 2019

// Given a non-negative number "num", return true if num is within 2 of a multiple of 10. Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2. See also: Introduction to Mod

// nearTen(12) → true
// nearTen(17) → false
// nearTen(19) → true

public class nearTen {

    public static void main(String[] args) {
        nearTen test = new nearTen();

        System.out.println(test.nearTen(12));
        System.out.println(test.nearTen(17));
        System.out.println(test.nearTen(19));
    }

    public boolean nearTen(int num) {
        int result = num % 10;
        if (result <= 2 || result == 18 || result == 19){
            return true;
        }
        return false;
    }

}
