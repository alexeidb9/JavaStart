package Lessons.main.Home;

public class HomeManagement {

    public static void main(String[] args) {

        Home home = new Home(100.50,200);

        home.amenitiesStatus();
        home.watchTv(5);
        home.amenitiesStatus();
        home.boilWater();
        home.amenitiesStatus();
        home.makeDinner();
        home.amenitiesStatus();
        home.takeBath();
        home.takeShower();
        home.amenitiesStatus();



    }

}
