package Tasks.Super;

public class Apple extends Fruit{

    public static final String variety = "jabłkowaty";

    public Apple(double weight, String type) {
        super(weight, type);
    }

    public String getVariety() {
        return variety;
    }

    @Override
    String getInfo() {
        return super.getInfo() + " " + "Variety: " + getVariety();
    }


}
