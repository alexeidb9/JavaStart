package Tasks.Home;

public class Home {

    double waterLiters;
    double fuelLiters;

    Home(double w, double f){
        waterLiters = w;
        fuelLiters = f;
    }

    void takeShower () {
        waterLiters -= 48;
    }

    void takeBath () {
        waterLiters -= 86;
    }

    void makeDinner() {
        waterLiters -= 4;
        fuelLiters -= 0.1;
    }

    void boilWater() {
        fuelLiters -= 0.05;
        waterLiters -= 0.5;
    }


    void watchTv(int h) {
        fuelLiters -= 0.06 * h;
    }

    void amenitiesStatus () {
        System.out.println("Water liters left: " + waterLiters + " and fuel liters left: " + fuelLiters);
    }




}
