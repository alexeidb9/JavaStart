package Tasks.BattleGame;

public class Team {

    private String name;
    private GameCharacter[] characters = new GameCharacter[3];

    public Team(String name, GameCharacter character1, GameCharacter character2, GameCharacter character3) {
        this.name = name;
        characters[0] = character1;
        characters[1] = character2;
        characters[2] = character3;
    }

    public GameCharacter[] getCharacters() {
        return characters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCharacters(GameCharacter[] characters) {
        this.characters = characters;
    }
    
    double attack() {
        double attack = 0;
        for (GameCharacter character : characters) {
            attack += character.getAttack();
        }
        return attack;
    }

    double defence() {
        double defence = 0;
        for (GameCharacter character : characters) {
            defence += character.getDefence();
        }
        return defence;
    }

    double energy() {
        double energy = 0;
        for (GameCharacter character : characters) {
            energy += character.getEnergy();
        }
        return energy;
    }

    
    


}
