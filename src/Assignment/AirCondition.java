package Assignment;

public class AirCondition {
    private String name;
    private boolean isOn;
    private  int temperature;

    public AirCondition(String panasonic) {
        this.name= panasonic;
    }


    public boolean isOn() {
        return isOn;
    }

    public boolean turnOn(boolean on) {
        if (on == true) {
            temperature = 16;
            isOn = true;
            return isOn;
        } else {
            isOn = false;
            return isOn;

        }
    }


    public int getTemperature() {
        return temperature;
    }

    public int increaseTemperature() {
        if (isOn = true){
        if (temperature == 30) {
            return temperature = 30;
        } else {
            return temperature++;
        }
        }else{
            return temperature = 0;
        }
    }
    public int decreaseTemperature() {
        if (isOn = true){
        if (temperature == 16) {
            return temperature = 16;
        } else {
            return temperature--;
        }
        }else {
            return  temperature = 0;
        }
    }
    public void setTemperature(int temperatureOfChoice) {
        temperature = temperatureOfChoice;
        if (isOn == true) {
            if (temperatureOfChoice > 30) {
                temperature = 30;
            }
            if (temperatureOfChoice < 16) {
                temperature = 16;
            }
        }else {
            temperature = 0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }
}

