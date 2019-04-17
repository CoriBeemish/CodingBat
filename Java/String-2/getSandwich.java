// FILE: getSandwich.java

// Completed on April 16th, 2019

// A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.

// getSandwich("breadjambread") → "jam"
// getSandwich("xxbreadjambreadyy") → "jam"
// getSandwich("xxbreadyy") → ""

public class getSandwich {

    public static void main(String[] args) {
        getSandwich test = new getSandwich();

        System.out.println(">" + test.getSandwich("breadjambread") + "<");
        System.out.println(">" + test.getSandwich("xxbreadjambreadyy") + "<");
        System.out.println(">" + test.getSandwich("xxbreadyy") + "<");
    }

    public String getSandwich(String str) {
        int start = str.indexOf("bread");
        int end = str.lastIndexOf("bread");

        if(start != end){
            return str.substring(start+5, end);
        }

        return "";
    }
}
