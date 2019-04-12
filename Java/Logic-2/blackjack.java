// FILE: blackjack.java

// Date completed: April 9th, 2019

// Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.

// blackjack(19, 21) → 21
// blackjack(21, 19) → 21
// blackjack(19, 22) → 19

public class blackjack {

    public static void main(String[] args) {
        blackjack test = new blackjack();

        System.out.println(test.blackjack(19, 21));
        System.out.println(test.blackjack(21, 19));
        System.out.println(test.blackjack(19, 22));
        System.out.println(test.blackjack(22, 22));
    }

    public int blackjack(int a, int b) {
//        if ( a = 0 || b = 0){
//            return
//        }


        if (a > 21) {
            a =0;
        }
        if ( b > 21){
            b =0;
        }

        if (a > b){
            return a;
        }
        else{
            return b;
        }

    }

}
