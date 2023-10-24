package Tasks.Super;

class Fruit {

//    Klasa powinna posiadać konstruktor pozwalający ustawić oba pola oraz metodę getInfo(), która zwraca informację o owocu w postaci Stringa.

    private double weight;
    private String type;

    public Fruit(double weight, String type) {
        this.weight = weight;
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    String getInfo() {
        return "Weight: " + getWeight() + " "
        + "Type: " + getType();

    }


}
