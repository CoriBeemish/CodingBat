// Completed on January 3rd, 2018

// Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".

// doubleX("axxbb") → true
// doubleX("axaxax") → false
// doubleX("xxxxx") → true

public class doubleX {

    public static void main(String[] args) {
        doubleX test = new doubleX();

        System.out.println(test.doubleX("axxbb"));
        System.out.println(test.doubleX("axaxax"));
        System.out.println(test.doubleX("xxxxx"));
    }

    boolean doubleX(String str) {
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)=='x')
                if (str.charAt(i+1)=='x') {
                    return true;
                } else {
                    return false;
                }
        }
        return false;
    }

}
