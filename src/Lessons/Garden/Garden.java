package Lessons.Garden;

public class Garden {

    public static void main(String[] args) {

        Plant plant1 = new Plant("Aerial","None");
        plant1.dailyWaterExpenditure = 1;
        Plant plant2 = new Plant("Willy", "None");
        plant2.dailyWaterExpenditure = 3;
        Plant plant3 = new Plant("Woofy", "None");
        plant3.dailyWaterExpenditure = 5;


        double weeklyWaterExpenditure = plant1.dailyWaterExpenditure +
                plant2.dailyWaterExpenditure
                + plant3.dailyWaterExpenditure;

        double yearlyWaterExpenditure = weeklyWaterExpenditure * 365;


        System.out.println(plant1.getName());
        System.out.println(yearlyWaterExpenditure);
        System.out.println(plant2.getName());
        System.out.println(plant3.getName());




    }



}
