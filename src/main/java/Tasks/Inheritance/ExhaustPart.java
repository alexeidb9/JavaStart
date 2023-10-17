package Tasks.Inheritance;

public class ExhaustPart extends Part{

    private boolean europeanStandard;

    public ExhaustPart(int id, String producer, String model, String serialNumber, boolean europeanStandard) {
        super(id, producer, model, serialNumber);
        this.europeanStandard = europeanStandard;
    }

    public boolean isEuropeanStandard() {
        return europeanStandard;
    }

    public void setEuropeanStandard(boolean europeanStandard) {
        this.europeanStandard = europeanStandard;
    }
}
