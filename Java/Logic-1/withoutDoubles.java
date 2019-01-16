// Completed on January 10th, 2019

// withoutDoubles(2, 3, true) → 5
// withoutDoubles(3, 3, true) → 7
// withoutDoubles(3, 3, false) → 6

public class withoutDoubles {

    public static void main(String[] args) {
        withoutDoubles test = new withoutDoubles();

        System.out.println(test.withoutDoubles(2, 3, true));
        System.out.println(test.withoutDoubles(3, 3, true));
        System.out.println(test.withoutDoubles(3, 3, false));
    }

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles && die1 == die2){
            die1++;
            if(die1 == 7){
                die1 = 1;
            }
        }
        return die1 + die2;
    }

}
