package test;


import newTurtle.Position;
import newTurtle.Turtle;

import org.junit.jupiter.api.Test;

import static newTurtle.Direction.*;
import static org.testng.AssertJUnit.*;

public class TurtleTest {

       Turtle ijapa = new Turtle();

    @Test
    public void testThatPenIsDown(){
        assertFalse(ijapa.isPenDown());
        ijapa.penDown();
        assertTrue(ijapa.isPenDown());
    }
    @Test
    public void testThatPenCanMoveUp(){
        assertFalse(ijapa.isPenDown());
        ijapa.penDown();
        assertTrue(ijapa.isPenDown());
        ijapa.penUp();
        assertFalse(ijapa.isPenDown());
    }

    @Test
    public void turtleCanTurnRight(){
        assertSame(EAST, ijapa.getDirection());
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getDirection());
    }
    @Test
    public void turtleCAnTurnRightFromEastToWest(){
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(WEST, ijapa.getDirection());

    }
    @Test
    public void turtleCAnTurnRightFromEastToNorth(){
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(NORTH, ijapa.getDirection());

    }
    @Test
    public void turtleCanTurnLeft(){
        assertSame(EAST, ijapa.getDirection());
        ijapa.turnLeft();
        assertSame(NORTH, ijapa.getDirection());
    }
    @Test
    public void turtleCanTurnLeftFromEastToWest(){
        assertSame(EAST, ijapa.getDirection());
        ijapa.turnLeft();
        assertSame(NORTH, ijapa.getDirection());
        ijapa.turnLeft();
        assertSame(WEST, ijapa.getDirection());
    }
    @Test
    public void turtleCanTurnLeftFromEastToSouth(){
        assertSame(EAST, ijapa.getDirection());
        ijapa.turnLeft();
        assertSame(NORTH, ijapa.getDirection());
        ijapa.turnLeft();
        assertSame(WEST, ijapa.getDirection());
        ijapa.turnLeft();
        assertSame(SOUTH, ijapa.getDirection());
    }
    @Test
    public void turtleCanTurnLeftFromEastToEast(){
        assertSame(EAST, ijapa.getDirection());
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();
//        ijapa.turnLeft();
        assertSame(SOUTH, ijapa.getDirection());
    }
    @Test
    public void turtleCanMoveForwardWhileFacingEast(){
        assertSame(EAST, ijapa.getDirection());
        assertFalse(ijapa.isPenDown());
        assertEquals(new Position(0,0), ijapa.getPosition());

        ijapa.moveForward(5);
        assertEquals(new Position(0,4), ijapa.getPosition());

    }


}
