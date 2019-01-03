// Completed on January 3rd, 2018

// Given a string, return true if it ends in "ly".

// endsLy("oddly") = true
// endsLy("y") = false
// endsLy("oddy") = false

public class endsLy {

    public static void main(String[] args) {
        endsLy test = new endsLy();

        System.out.println(test.endsLy("oddly"));
        System.out.println(test.endsLy("y"));
        System.out.println(test.endsLy("oddy"));
    }

    public boolean endsLy(String str) {
        return str.endsWith("ly");
    }

}
