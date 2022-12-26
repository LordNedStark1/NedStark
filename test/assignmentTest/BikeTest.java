package assignmentTest;

import Assignment.Bike;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    Bike bike;
    @BeforeEach
    void newBikeObject(){
        bike = new Bike();
        bike.isOn();
    }
    @Test
    void onBike(){
        assertTrue(bike.isOn());
    }
    @Test
    void turnBikeOff(){
        assertFalse(bike.isOff());
    }
    @Test
    void accelerateBike(){
        bike.isOn();
        bike.accelerateBike(bike.getGear());
        assertEquals(1,bike.getSpeed());
    }

    @Test
    void setSpeedTemporarilyForGearChange(){
        bike.setSpeed(20);
        assertEquals(20,bike.getSpeed());
    }
    @Test
    void gearOne(){
        bike.setSpeed(10);
        assertEquals(10,bike.getSpeed());
        bike.changeGear(bike.getSpeed());
        assertEquals(1, bike.getGear());
    }
    @Test
    void gearTwo(){
        bike.setSpeed(20);
        bike.accelerateBike(bike.getGear());
        bike.changeGear(bike.getSpeed());
        assertEquals(2,bike.getGear());
    }
    @Test
    void automaticIncreaseGear(){
        bike.setSpeed(30);
        bike.accelerateBike(bike.getGear());
        assertEquals(31,bike.getSpeed());
        bike.changeGear(bike.getSpeed());
        assertEquals(3,bike.getGear());
        bike.setSpeed(40);
        bike.accelerateBike(bike.getGear());
        assertEquals(41,bike.getSpeed());
        bike.changeGear(bike.getSpeed());
        assertEquals(4,bike.getGear());
    }
    @Test
    void accelerationAtGearTwo(){
        bike.setSpeed(22);
        assertEquals(2, bike.getGear());
        bike.accelerateBike(bike.getGear());
//        assertEquals(24,bike.getSpeed());
    }

}
