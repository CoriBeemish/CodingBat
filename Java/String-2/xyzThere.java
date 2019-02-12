// Completed on February 11th, 2019

// xyzThere

public class xyzThere {

    public static void main(String[] args) {
        xyzThere test = new xyzThere();

        System.out.println(test.xyzThere("abcxyz"));
        System.out.println(test.xyzThere("abc.xyz"));
        System.out.println(test.xyzThere("xyz.abc"));
    }

    public boolean xyzThere(String str) {
        for(int i =0; i < str.length() - 2; i++){
            if(str.substring(i,i+3).equals("xyz")){
                if (i==0 || str.charAt( i - 1) != '.'){
                    return true;
                }
            }
        }
        return false;
    }

}
