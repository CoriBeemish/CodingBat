/*
Completed December 30th, 2018

Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.

front22("kitten") → "kikittenki"
front22("Ha") → "HaHaHa"
front22("abc") → "ababcab"
*/


// CodingBat Solution
public String front22(String str) {
  String front;
  
  if (str.length() <= 2){
    front = str;
  }
  else{
    front = str.substring(0, 2);
  }
  
  return front + str + front;
}


// Complier Solution
public class Main {

    public static void main(String[] args) {

        String front;
        String str = "";


        if(str.length() <= 2){
            front = str;
        }
        else {
            front = str.substring(0, 2);
        }

        System.out.println(front + str + front);

    }
}
