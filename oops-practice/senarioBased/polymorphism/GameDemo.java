abstract class GameCharacter {
    String characterName;
    GameCharacter(String name) { characterName = name; }
    abstract void performAttack();
}

class Warrior extends GameCharacter {
    Warrior(String name) { super(name); }
    void performAttack() { System.out.println(characterName + " slashes with sword!"); }
}
class Mage extends GameCharacter {
    Mage(String name) { super(name); }
    void performAttack() { System.out.println(characterName + " casts fireball!"); }
}
class Archer extends GameCharacter {
    Archer(String name) { super(name); }
    void performAttack() { System.out.println(characterName + " shoots arrow!"); }
}

public class GameDemo {
    static void startBattle(GameCharacter[] chars) {
        int w=0,m=0,a=0;
        for (GameCharacter c : chars) {
            c.performAttack();
            if (c instanceof Warrior) w++;
            else if (c instanceof Mage) m++;
            else if (c instanceof Archer) a++;
        }
        System.out.println("Warriors: " + w + ", Mages: " + m + ", Archers: " + a);
    }

    public static void main(String[] args) {
        GameCharacter[] team = { new Warrior("Arjun"), new Mage("Merlin"), new Archer("Robin") };
        startBattle(team);
    }
}
