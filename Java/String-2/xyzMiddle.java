// Completed on February 12th, 2018

// xyzMiddle
// Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.

// xyzMiddle("AAxyzBB") → true
// xyzMiddle("AxyzBB") → true
// xyzMiddle("AxyzBBB") → false

public class xyzMiddle {

    public static void main(String[] args) {
        xyzMiddle test = new xyzMiddle();

        System.out.println(test.xyzMiddle("AAxyzBB"));
        System.out.println(test.xyzMiddle("AxyzBB"));
        System.out.println(test.xyzMiddle("AxyzBBB"));
    }

    public boolean xyzMiddle(String str) {
        int middle = str.length()/2;

        if (str.length() < 3){
            return false;
        }

        for (int i = 0; i < str.length() - 2; i++){
            if(str.substring(i, i +3).equals("xyz")){
                return true;
            }
        }
        return false;
    }

}
