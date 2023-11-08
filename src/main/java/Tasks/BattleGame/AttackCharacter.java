package Tasks.BattleGame;

public class AttackCharacter extends GameCharacter {

    private double extraAttack;

    public AttackCharacter(String name, double attackStrength, double defenceStrength, double energy, double extraAttack) {
        super(name, attackStrength, defenceStrength, energy);
        this.extraAttack = extraAttack;
    }

    @Override
    double totalAttack() {
        return getAttack() + extraAttack * getAttack();
    }

    public double getExtraAttack() {
        return extraAttack;
    }

    public void setExtraAttack(double extraAttack) {
        this.extraAttack = extraAttack;
    }
}
