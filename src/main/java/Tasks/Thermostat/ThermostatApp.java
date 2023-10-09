package Tasks.Thermostat;

import java.util.Scanner;

public class ThermostatApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Provide actual temperature: ");
        double actualTemperature = input.nextInt();
        System.out.println("Provide desired tempersature: ");
        int targetTemperature = input.nextInt();
        input.close();


        Thermostat thermostat = new Thermostat(actualTemperature,targetTemperature);
        while (!thermostat.targetTemperatureReached()) {
            System.out.println("Actual temperature is: " + thermostat.getActualTemperature());
            thermostat.adjustTemperature();
        }





        System.out.println("Reached target temperature: " + thermostat.getActualTemperature() + " C");

    }




    }

