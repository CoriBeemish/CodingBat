// Solved December 30th, 2018

// Given a string, return a new string where the first and last chars have been exchanged.

// frontBack("code") → "eodc"
// frontBack("a") → "a"
// frontBack("ab") → "ba"


// CodingBat Solution

public String frontBack(String str) {
  String start, middle, end;
  if(str.length() == 0){
    return str;
  }
  else if(str.length() == 1){
    return str;
  }
  else{
    start = str.substring(0,1);
    middle = str.substring(1, str.length()-1);
    end = str.substring(str.length()-1);
    
    return end + middle + start;
  }
}


//IntelliJ Solution

public class Main {

    public static void main(String[] args) {
        String start, middle, end;
        String str = "code";

        if (str.length() == 0){
            System.out.println(str);
        }
        else if(str.length() == 1){
            System.out.println(str);
        }
        else{
            start = str.substring(0,1);
            middle = str.substring(1, str.length()-1);
            end = str.substring(str.length()-1);

            System.out.println(end + middle + start);
        }
    }
}
