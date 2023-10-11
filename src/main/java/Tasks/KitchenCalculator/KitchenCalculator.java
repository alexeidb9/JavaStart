package Tasks.KitchenCalculator;

public class KitchenCalculator {
    public static void main(String[] args) {
        double waterGlasses = 2;
        double oilSpoons = 2.5;
        double honeyTeaspoons = 4;

        double waterMl = KitchenUtils.glassesToMl(waterGlasses);
        double oilMl = KitchenUtils.spoonsToMl(oilSpoons);
        double honeyMl = KitchenUtils.teaspoonToMl(honeyTeaspoons);

        System.out.println("For the recipy you will need:");
        System.out.println(waterGlasses + " cups, or " + waterMl + "ml of water");
        System.out.println(oilSpoons + " spoons, or " + oilMl + "ml of oil");
        System.out.println(honeyTeaspoons + " spoons, or " + honeyMl + "ml of honey");
    }

}
