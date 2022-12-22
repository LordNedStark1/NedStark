package moveFiles;

import org.junit.jupiter.api.Test;
import tdd.RunWayLength;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RunWayLengthTest {

    @Test
    void runWayLength(){
        // given
        RunWayLength length = new RunWayLength();
        //when
        length.CalculateRunWayLength(60, 3.5);
        double total = length.getAnswer();
        //check
        assertEquals(514.2857142857143, total);
    }


}
