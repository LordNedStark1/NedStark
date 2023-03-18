import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tddFirst.TwoInteger;

public class DifferenceOfTheSquare {
    TwoInteger twoInt;
    @BeforeEach
    void integer(){
        twoInt =new TwoInteger;
    }
    @Test
    void squareOfEachNumber(){
        twoInt.squareOfEachNumber(2,3);

    }
}
