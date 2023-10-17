package Tasks.Inheritance.MotorShop;

public class Part {

    private int id;
    private String producer;
    private String model;
    private String serialNumber;

    public Part(int id, String producer, String model, String serialNumber) {
        this.id = id;
        this.producer = producer;
        this.model = model;
        this.serialNumber = serialNumber;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
