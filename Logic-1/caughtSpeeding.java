// Completed on January 6th, 2018

// You are driving a little too fast, and a police officer stops you. Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.

// caughtSpeeding(60, false) → 0
// caughtSpeeding(65, false) → 1
// caughtSpeeding(65, true) → 0

public class caughtSpeeding {

    public static void main(String[] args) {
        caughtSpeeding test = new caughtSpeeding();

        System.out.println(test.caughtSpeeding(60, false));
        System.out.println(test.caughtSpeeding(65, false));
        System.out.println(test.caughtSpeeding(65, true));
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        int lowerLimit = 60;
        int higherLimit = 80;

        if (isBirthday) {
            lowerLimit += 5;
            higherLimit += 5;
        }

        if (speed <= lowerLimit) {
            return 0;
        }
        else if (speed <= higherLimit) {
            return 1;
        }

        return 2;
    }

}
