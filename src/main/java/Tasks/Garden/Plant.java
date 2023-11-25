package Tasks.Garden;

public class Plant {

    private String name;
    private String description;
    double dailyWaterExpenditure;

    public Plant(String name, String description) {
        this.name = name;
        this.description = description;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
