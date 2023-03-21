package newTurtle;

import static newTurtle.Direction.*;

public class Turtle {
    private Direction direction = EAST;
    private boolean isPenDown;

    public Direction getDirection() {
        return direction;
    }

    public void turnLeft() {
        if(direction == SOUTH) face(EAST);
        if(direction == WEST) face(SOUTH);
        if(direction == NORTH) face(WEST);
        if(direction == EAST) face(NORTH);
    }

    private void face(Direction newDirection) {
        direction = newDirection;
    }

    public void turnRight() {
        if(direction == WEST) face(NORTH);
        if(direction == SOUTH) face(WEST);
        if(direction == EAST) face(SOUTH);
    }

    public boolean isPenDown() {
        return isPenDown;
    }

    public void penDown() {
        isPenDown = true;


    }


    public void penUp() {
        isPenDown = !isPenDown ;
    }

    public Position getPosition() {

    }

    public void moveForward(int i) {
    }
}
