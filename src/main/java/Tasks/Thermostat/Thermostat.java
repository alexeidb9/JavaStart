package Tasks.Thermostat;

public class Thermostat {

    private double actualTemperature;
    private int targetTemperature;


    public Thermostat(double actualTemperature, int targetTemperature) {
        this.actualTemperature = actualTemperature;
        this.targetTemperature = targetTemperature;
    }


    public double getActualTemperature() {
        return actualTemperature;
    }

    public void setActualTemperature(double actualTemperature) {
        this.actualTemperature = actualTemperature;
    }

    public int getTargetTemperature() {
        return targetTemperature;
    }

    public void setTargetTemperature(int targetTemperature) {
        this.targetTemperature = targetTemperature;
    }


    boolean targetTemperatureReached () {
        return actualTemperature == targetTemperature;
    }

    void adjustTemperature () {
        double temperatureDiff = targetTemperature - actualTemperature;
        if (temperatureDiff > 0) {
            actualTemperature +=0.5;
        } else
            actualTemperature-=0.5;
    }

    }


