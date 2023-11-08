package Tasks.BattleGame;

public class GameSimulator {


    public static void main(String[] args) {
        AttackCharacter character1 = new AttackCharacter("Bob",100,100,100,0.2);
        AttackCharacter character2 = new AttackCharacter("Jon",120,100,100,0.2);
        DefenceCharacter character3 = new DefenceCharacter("Amy", 100,100,100,0.3);
        AttackCharacter character4 = new AttackCharacter("Janusz",120,100,100,0.2);
        AttackCharacter character5 = new AttackCharacter("Zbyszek",120,100,100,0.2);
        DefenceCharacter character6 = new DefenceCharacter("Jacek", 100,100,100,0.2);

        Team team1 = new Team("TeamOne", character1,character2,character3);
        Team team2 = new Team("TeamTwo", character4,character5,character6);

        BattleSimulator.fight(team1,team2);


    }




}
