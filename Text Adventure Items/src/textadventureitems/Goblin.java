package textadventureitems;

public class Goblin extends Enemy {
    private int agility;
    public Goblin (int health, int attack, int agility) {
        super(health, attack);
        this.agility = agility;
    }
}
