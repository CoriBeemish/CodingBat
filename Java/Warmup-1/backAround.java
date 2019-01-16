// Completed on December 30th, 2018

/*
Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.

backAround("cat") → "tcatt"
backAround("Hello") → "oHelloo"
backAround("a") → "aaa"
*/

// CodingBat Solution

public String backAround(String str) {
  String end;
  
  if (str.length() <= 1){
    end = str;
  }
  else{
    end = str.substring(str.length()-1);
  }
  
  return (end + str + end);
}


// IntelliJ Solution

public class Main {

    public static void main(String[] args) {

        String end;
        String str = "a";

        if(str.length() == 0){
            end = str;
        }
        else if ( str.length() == 1){
            end = str;
        }
        else {
            end = str.substring(str.length()-1);
        }

        System.out.println(end + str + end);

    }
}
