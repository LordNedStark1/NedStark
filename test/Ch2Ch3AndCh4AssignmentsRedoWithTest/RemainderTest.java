package Ch2Ch3AndCh4AssignmentsRedoWithTest;

import chapterTwo.Remainder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RemainderTest {
    @Test
    void remainderMethodWithRemainder() {
        var remainder = new Remainder();
        remainder.verifyNumber(7);
        assertFalse( remainder.returnVerifiedAnswer());
    }

    @Test
    void remainderMethodWithOutRemainder() {
        var remainder = new Remainder();
        remainder.verifyNumber(6);
        assertTrue( remainder.returnVerifiedAnswer());
    }
}