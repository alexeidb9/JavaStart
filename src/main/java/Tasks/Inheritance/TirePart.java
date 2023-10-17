package Tasks.Inheritance;

public class TirePart extends Part{

    private double size;
    private double width;


    public TirePart(int id, String producer, String model, String serialNumber, double size, double width) {
        super(id, producer, model, serialNumber);
        this.size = size;
        this.width = width;
    }


    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
