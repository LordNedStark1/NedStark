package assignmentTest;

import Assignment.AirCondition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionTest {
    AirCondition panasonic;

    @BeforeEach
    void instance() {
        panasonic = new AirCondition("panasonic");
    }

    @Test
    void actualIsOnValue() {
        assertFalse(panasonic.isOn());
    }



    @Test
    void getTemperatureMethod() {
        panasonic.turnOn(true);
        assertEquals(16, panasonic.getTemperature());
    }

    @Test
    void increaseTemperatureMethod() {
        panasonic.turnOn(true);
        panasonic.increaseTemperature();
        assertEquals(17, panasonic.getTemperature());
        panasonic.increaseTemperature();
        assertEquals(18, panasonic.getTemperature());
        panasonic.increaseTemperature();
        assertEquals(19, panasonic.getTemperature());
    }

    @Test
    void decreaseTemperature() {
        panasonic.turnOn(true);
        panasonic.decreaseTemperature();
        assertEquals(16, panasonic.getTemperature());
        panasonic.decreaseTemperature();
        assertEquals(16, panasonic.getTemperature());
    }

    @Test
    void DonotIncreaseMoreThan30() {
        panasonic.turnOn(true);
        assertEquals(16, panasonic.getTemperature());
        panasonic.setTemperature(29);
        assertEquals(29, panasonic.getTemperature());
        panasonic.increaseTemperature();
        assertEquals(30, panasonic.getTemperature());
        panasonic.increaseTemperature();
        assertEquals(30, panasonic.getTemperature());
    }

    @Test
    void DonotReduceMoreThan16() {
        panasonic.turnOn(true);
        assertEquals(16, panasonic.getTemperature());
        panasonic.setTemperature(16);
        assertEquals(16, panasonic.getTemperature());
        panasonic.decreaseTemperature();
        assertEquals(16, panasonic.getTemperature());
    }
    @Test
    void getNameMethod(){
        assertEquals("panasonic", panasonic.getName());
    }
    @Test
    void setNameMethod(){
        panasonic.setName("L.G");
        assertEquals("L.G", panasonic.getName());
    }
    @Test
    void setTemperatureMethod(){
        panasonic.turnOn(false);
        assertEquals(0, panasonic.getTemperature());
        panasonic.setTemperature(45);
        assertEquals(0, panasonic.getTemperature());

    }
//    @Test
//    void temperatureWhenOff(){
//        panasonic.turnOn(false);
//        assertEquals(0, panasonic.getTemperature());
//        panasonic.increaseTemperature();
//        assertEquals(0, panasonic.getTemperature());
//        panasonic.decreaseTemperature();
//        assertEquals(0, panasonic.getTemperature());
//    }
}