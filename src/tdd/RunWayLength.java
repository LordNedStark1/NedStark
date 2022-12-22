package tdd;

public class RunWayLength {
    private double total;


    public RunWayLength(){
    }


    public void CalculateRunWayLength(int velocity, double acceleration) {
        double length = (velocity * velocity) / (2 * acceleration);
        total = length;
    }

    public double getAnswer() {

        return total;
    }
}
