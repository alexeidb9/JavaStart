package Tasks.BattleGame;

public class BattleSimulator {

    static void fight(Team t1, Team t2) {
        double t2Energy = attack(t1, t2);
        double t1Energy = attack(t2, t1);
        double energyDiff = t1Energy - t2Energy;
        if (energyDiff > 0) {
            System.out.println(t1.getName() + " " + "wins!");
        } else if (energyDiff < 0) {
            System.out.println(t2.getName() + " " + "wins!");
        } else {
            System.out.println("Rematch");
        }
    }

    private static double attack(Team attacker, Team defender) {
        double attack = attacker.attack();
        double defence = defender.defence();
        double attackPower = attack - defence;
        double energy = defender.energy();

        if (attackPower > 0) {
            double result = energy - attackPower;
            return result >= 0? result : 0;
        } else {


            return energy;
        }

    }
}