package Tasks.BattleGame;

public class DefenceCharacter extends GameCharacter {

    private double extraDefence;

    public DefenceCharacter(String name, double strength, double armor, double energy, double extraDefence) {
        super(name, strength, armor, energy);
        this.extraDefence = extraDefence;
    }


    @Override
    double totalDefence() {
        return getDefence() + extraDefence * getDefence();
    }

    public double getExtraDefence() {
        return extraDefence;
    }

    public void setExtraDefence(double extraDefence) {
        this.extraDefence = extraDefence;
    }
}
