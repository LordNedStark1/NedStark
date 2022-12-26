package Assignment;

public class Bike {
    private int acceleration;
    private int gear;

    public boolean isOn() {
        return true;
    }

    public boolean isOff() {
        return false;
    }

    public void accelerateBike(int gearNumber) {
        gear = gearNumber;
        if (gear == 1) {
            acceleration++;
        } else if (gear ==2 ) {
            acceleration += 2;
        }

    }

    public int getSpeed() {
        return acceleration;
    }

    public void changeGear(int speed) {
        acceleration = speed;
        if (acceleration >0 ){
            gear =1;
        } if (acceleration >20 && acceleration < 30) {
            gear = 2;
        } else if (acceleration >30 && acceleration < 40){
            gear =3;
        }else if (acceleration > 40){
            gear =4;
        }
    }

    public int getGear() {
        return gear;
    }

    public void setSpeed(int speed) {
        acceleration = speed;
    }
}
