package XmasArraySnackTest;

import XmassArraySnack.MbtiPersonalityCheckMain;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MbtiPersonalityTest {
    MbtiPersonalityCheckMain mbti;
    @BeforeEach
    void instance(){
        mbti = new MbtiPersonalityCheckMain();
    }
    @Test
    void displayMenu(){
//        assertEquals( 1,mbti.menu());
    }
    @Test
    void questionPrompt(){

    }
}
