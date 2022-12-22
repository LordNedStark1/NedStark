package chapterTwo;

public class Remainder {
    private  int remainderValue;
    private boolean remainder;
    public boolean returnVerifiedAnswer() {
        if ( remainderValue == 0){
            remainder = true;
        }
        else if (remainderValue != 0) {
             remainder = false;
        }
        return remainder;
    }

    public void verifyNumber(int numberToCheck) {
        remainderValue = numberToCheck % 3;
    }
}